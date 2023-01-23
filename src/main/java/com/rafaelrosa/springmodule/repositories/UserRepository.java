package com.rafaelrosa.springmodule.repositories;

import com.rafaelrosa.springmodule.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {



}
