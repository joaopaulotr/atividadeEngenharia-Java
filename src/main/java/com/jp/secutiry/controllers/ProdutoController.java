package com.jp.secutiry.controllers;


import com.jp.secutiry.models.ProdutoModel;
import com.jp.secutiry.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/pessoas")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> findAll(){
        return produtoService.findAll();
    }

    @PostMapping
    public ProdutoModel criarPessoa(@RequestBody ProdutoModel produtoModel){
        return produtoService.criarPessoa(produtoModel);
    }



}
