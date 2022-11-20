package com.projeto.ds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.ds.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
