package com.jhenriquedsm.webservice.repositories;

import com.jhenriquedsm.webservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}