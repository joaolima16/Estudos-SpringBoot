package com.example.projetoTeste.joao.resources;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoTeste.joao.entities.Order;
import com.example.projetoTeste.joao.entities.User;
import com.example.projetoTeste.joao.services.OrderService;
import com.example.projetoTeste.joao.services.UserService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
  
    @Autowired
    private OrderService _OrderService;
    
    @GetMapping
    public void findAll() {
    //     Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), null);
    //     return ResponseEntity.ok().body(o1);
    }

    @GetMapping(value = "/teste")
    public ResponseEntity<List<Order>> listUsers() {
        List<Order> lsOrders = _OrderService.findAll();
        return ResponseEntity.ok().body(lsOrders);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Order obj = _OrderService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
