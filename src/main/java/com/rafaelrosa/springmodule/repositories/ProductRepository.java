package com.rafaelrosa.springmodule.repositories;

import com.rafaelrosa.springmodule.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {



}
