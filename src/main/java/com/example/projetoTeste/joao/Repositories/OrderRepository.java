package com.example.projetoTeste.joao.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoTeste.joao.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
