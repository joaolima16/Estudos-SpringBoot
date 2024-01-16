package com.example.projetoTeste.joao.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoTeste.joao.entities.Category;
import com.example.projetoTeste.joao.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    private CategoryService _CategoryService;

    @GetMapping
    public void findAll() {
        // Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), null);
        // return ResponseEntity.ok().body(o1);
    }

    @GetMapping(value = "/teste")
    public ResponseEntity<List<Category>> listUsers() {
        List<Category> lsCategories = _CategoryService.findAll();
        return ResponseEntity.ok().body(lsCategories);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Category obj = _CategoryService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
