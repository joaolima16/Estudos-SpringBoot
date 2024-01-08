package com.example.projetoTeste.joao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.projetoTeste.joao.Repositories.OrderRepository;
import com.example.projetoTeste.joao.entities.Order;
import com.example.projetoTeste.joao.entities.User;

public class OrderService {
    @Autowired
    private OrderRepository _OrderRepository;

    public List<Order> findAll() {
        return _OrderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> order = _OrderRepository.findById(id);
        return order.get();
    }

    public Order addUser(Order _order) {
        _OrderRepository.save(_order);
        return _order;
    }
}
