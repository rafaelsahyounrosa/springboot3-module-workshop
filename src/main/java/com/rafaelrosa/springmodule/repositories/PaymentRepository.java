package com.rafaelrosa.springmodule.repositories;

import com.rafaelrosa.springmodule.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {



}
