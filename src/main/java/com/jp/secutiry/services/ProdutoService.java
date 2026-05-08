package com.jp.secutiry.services;


import com.jp.secutiry.models.ProdutoModel;
import com.jp.secutiry.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll() {
        return produtoRepository.findAll();
    }

    public ProdutoModel criarPessoa(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }
}
