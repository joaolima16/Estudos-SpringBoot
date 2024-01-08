package com.example.projetoTeste.joao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetoTeste.joao.Repositories.UserRepository;
import com.example.projetoTeste.joao.entities.User;

@Service
public class UserService {
    @Autowired
    private UserRepository _UserRepository;

    public List<User> findAll() {
        return _UserRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = _UserRepository.findById(id);
        return user.get();
    }

    public User addUser(User _user) {
        _UserRepository.save(_user);
        return _user;
    }
}
