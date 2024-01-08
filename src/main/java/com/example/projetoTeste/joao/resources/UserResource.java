package com.example.projetoTeste.joao.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoTeste.joao.entities.User;
import com.example.projetoTeste.joao.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService _UserService;

    @GetMapping
    public ResponseEntity<User> findAll() {
        User _user = new User(1L, "joao", "joao@teste.com", "11414617", "1234");
        return ResponseEntity.ok().body(_user);
    }

    @GetMapping(value = "/teste")
    public ResponseEntity<List<User>> listUsers() {
        List<User> lsUsers = _UserService.findAll();
        return ResponseEntity.ok().body(lsUsers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        User obj = _UserService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
  
}
