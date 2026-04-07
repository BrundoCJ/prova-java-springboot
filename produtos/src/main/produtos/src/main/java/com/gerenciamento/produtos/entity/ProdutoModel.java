package com.gerenciamento.produtos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Entity
@Data
public class ProdutoModel {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String descricao;
    private double preco;
    private Status status;
}