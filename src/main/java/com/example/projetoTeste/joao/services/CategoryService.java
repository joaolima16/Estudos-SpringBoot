package com.example.projetoTeste.joao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetoTeste.joao.Repositories.CategoryRepository;
import com.example.projetoTeste.joao.entities.Category;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository _CategoryRepository;

    public List<Category> findAll() {
        return _CategoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> category = _CategoryRepository.findById(id);
        return category.get();
    }

    public Category addCategory(Category _Category) {
        _CategoryRepository.save(_Category);
        return _Category;
    }
}
