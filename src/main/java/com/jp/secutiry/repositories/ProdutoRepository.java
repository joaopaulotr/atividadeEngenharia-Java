package com.jp.secutiry.repositories;

import com.jp.secutiry.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
