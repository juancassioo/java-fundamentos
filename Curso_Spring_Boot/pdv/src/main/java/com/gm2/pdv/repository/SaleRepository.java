package com.gm2.pdv.repository;

import com.gm2.pdv.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> { // 1º param: entidade, 2º param: tipo da chave primária
}
