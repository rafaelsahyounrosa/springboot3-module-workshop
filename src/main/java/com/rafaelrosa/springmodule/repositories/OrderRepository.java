package com.rafaelrosa.springmodule.repositories;

import com.rafaelrosa.springmodule.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {



}
