package com.api.unipar.controller;

import com.api.unipar.entidades.Categoria;
import com.api.unipar.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/listar_categorias")
    public List<Categoria> listarTodosClientes(){
        return categoriaService.listarTodasCategorias();
    }

    @PostMapping("/salvar_categorias")
    public Categoria salvarCategoria(@RequestBody Categoria categoria){
        return categoriaService.salvarCategoria(categoria);
    }

    @DeleteMapping("/deletar_categorias/{id}")
    public void deletarCategoriaPorId(@PathVariable Long id){
        categoriaService.deletarCategoriaPorId(id);
    }

    @PutMapping("/atualizar_categorias")
    public Categoria atualizarCategoria(@PathVariable Long id, @RequestBody Categoria categoria){
        return categoriaService.atualizarCategoriaPorId(id, categoria);
    }


}
