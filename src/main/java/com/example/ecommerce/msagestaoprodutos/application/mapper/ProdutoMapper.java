package com.example.ecommerce.msagestaoprodutos.application.mapper;

import com.example.ecommerce.msagestaoprodutos.domain.model.Produto;
import com.example.ecommerce.msagestaoprodutos.application.dto.ProdutoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);

    ProdutoDTO produtoToProdutoDTO(Produto produto);
    Produto produtoDTOToProduto(ProdutoDTO produtoDTO);
}
