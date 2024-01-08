package com.example.projetoTeste.joao.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoTeste.joao.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
