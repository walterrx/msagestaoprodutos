package com.example.ecommerce.msagestaoprodutos.infrastructure.web;

import com.example.ecommerce.msagestaoprodutos.application.dto.ProdutoDTO;
import com.example.ecommerce.msagestaoprodutos.application.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<ProdutoDTO> createProduto(@RequestBody ProdutoDTO produtoDTO) {
        ProdutoDTO novoProduto = produtoService.createProduto(produtoDTO);
        return new ResponseEntity<>(novoProduto, HttpStatus.CREATED);
    }

    @GetMapping
    public List<ProdutoDTO> getAllProdutos() {
        return produtoService.getAllProdutos();
    }

    // Implementar outros endpoints para atualização, deleção e busca por ID
}
