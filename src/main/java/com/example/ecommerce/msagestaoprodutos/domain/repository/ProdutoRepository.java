package com.example.ecommerce.msagestaoprodutos.domain.repository;

import com.example.ecommerce.msagestaoprodutos.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Optional<Produto> findById(Long id);
    Produto save(Produto produto);
    void delete(Produto produto);
    List<Produto> findAll();
}