package com.gerenciamento.produtos.repository;

import com.gerenciamento.produtos.entity.ProdutoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
