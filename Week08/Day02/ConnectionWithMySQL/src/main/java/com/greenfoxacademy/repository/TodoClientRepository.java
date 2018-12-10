package com.greenfoxacademy.repository;

import com.greenfoxacademy.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoClientRepository extends JpaRepository<Client, Long> {

    Client findByUsername(String username);
}
