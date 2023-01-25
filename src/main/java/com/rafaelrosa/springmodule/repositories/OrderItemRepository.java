package com.rafaelrosa.springmodule.repositories;

import com.rafaelrosa.springmodule.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}
