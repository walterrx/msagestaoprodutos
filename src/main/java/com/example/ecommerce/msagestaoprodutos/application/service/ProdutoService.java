package com.example.ecommerce.msagestaoprodutos.application.service;

import com.example.ecommerce.msagestaoprodutos.application.dto.ProdutoDTO;
import com.example.ecommerce.msagestaoprodutos.application.mapper.ProdutoMapper;
import com.example.ecommerce.msagestaoprodutos.domain.model.Produto;
import com.example.ecommerce.msagestaoprodutos.domain.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final ProdutoMapper produtoMapper;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository, ProdutoMapper produtoMapper) {
        this.produtoRepository = produtoRepository;
        this.produtoMapper = produtoMapper;
    }

    public ProdutoDTO createProduto(ProdutoDTO produtoDTO) {
        Produto produto = produtoMapper.produtoDTOToProduto(produtoDTO);
        produto.validarProduto();
        produto = produtoRepository.save(produto);
        return produtoMapper.produtoToProdutoDTO(produto);
    }

    public List<ProdutoDTO> getAllProdutos() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos.stream()
                .map(produtoMapper::produtoToProdutoDTO)
                .collect(Collectors.toList());
    }

    // Implementar métodos para updateProduto, deleteProduto, e getProdutoById...
}