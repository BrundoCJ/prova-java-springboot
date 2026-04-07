package com.gerenciamento.produtos.controller;


import com.gerenciamento.produtos.entity.ProdutoModel;
import com.gerenciamento.produtos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping ("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> listarProdutos(){
        return produtoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<ProdutoModel> buscarPorId(@PathVariable Long id){
        return produtoService.buscarPorId(id);
    }

    @PostMapping
    public ProdutoModel criar(@RequestBody ProdutoModel ProdutoModel){
        return produtoService.criar(ProdutoModel);
    }

    @PutMapping("/{id}")
    public ProdutoModel atualizar(@PathVariable Long id, @RequestBody ProdutoModel Produto){
        return produtoService.atualizar(id, Produto);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id){
        produtoService.deletar(id);
    }



}
