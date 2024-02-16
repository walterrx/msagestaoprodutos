package com.example.ecommerce.msagestaoprodutos;

import com.example.ecommerce.msagestaoprodutos.application.dto.ProdutoDTO;
import com.example.ecommerce.msagestaoprodutos.application.service.ProdutoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class ProdutoServiceTest {

    @Autowired
    private ProdutoService produtoService;

    @Test
    void quandoPrecoNegativo_entaoLancaExcecao() {
        ProdutoDTO produtoDTO = new ProdutoDTO();
        produtoDTO.setPreco(new BigDecimal("-10"));

        assertThrows(IllegalArgumentException.class, () -> produtoService.createProduto(produtoDTO));
    }
}
