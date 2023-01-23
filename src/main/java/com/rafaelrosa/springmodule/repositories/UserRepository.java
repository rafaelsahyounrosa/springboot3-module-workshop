package com.rafaelrosa.springmodule.repositories;

import com.rafaelrosa.springmodule.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
