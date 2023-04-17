package com.produtos.apiRest.repository;

import com.produtos.apiRest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

        Produto findById(long id);
}
