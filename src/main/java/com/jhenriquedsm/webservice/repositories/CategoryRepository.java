package com.jhenriquedsm.webservice.repositories;

import com.jhenriquedsm.webservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}