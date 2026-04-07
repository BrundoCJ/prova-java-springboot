package com.gerenciamento.produtos.service;

import com.gerenciamento.produtos.entity.ProdutoModel;
import com.gerenciamento.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> listarTodos(){
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> buscarPorId(Long id){
        return produtoRepository.findById(id);
    }

    public ProdutoModel criar(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public ProdutoModel atualizar(Long id,ProdutoModel produtoAtualizado){
        produtoAtualizado.setId(id);
        return produtoRepository.save(produtoAtualizado);
    }

    public void deletar(Long id){
        produtoRepository.deleteById(id);
    }
}