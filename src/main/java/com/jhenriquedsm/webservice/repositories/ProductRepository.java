package com.jhenriquedsm.webservice.repositories;

import com.jhenriquedsm.webservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}