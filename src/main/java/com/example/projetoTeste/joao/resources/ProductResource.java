package com.example.projetoTeste.joao.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoTeste.joao.entities.Order;
import com.example.projetoTeste.joao.entities.Product;
import com.example.projetoTeste.joao.services.OrderService;
import com.example.projetoTeste.joao.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
      
    @Autowired
    private ProductService _ProductService;
    
    @GetMapping
    public void findAll() {
    //     Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), null);
    //     return ResponseEntity.ok().body(o1);
    }

    @GetMapping(value = "/teste")
    public ResponseEntity<List<Product>> listUsers() {
        List<Product> lsProducts = _ProductService.findAll();
        return ResponseEntity.ok().body(lsProducts);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Product obj = _ProductService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
