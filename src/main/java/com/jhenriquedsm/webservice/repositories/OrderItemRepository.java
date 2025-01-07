package com.jhenriquedsm.webservice.repositories;

import com.jhenriquedsm.webservice.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}