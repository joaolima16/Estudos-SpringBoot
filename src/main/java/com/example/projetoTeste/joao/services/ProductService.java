package com.example.projetoTeste.joao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetoTeste.joao.Repositories.ProductRepository;
import com.example.projetoTeste.joao.entities.Product;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository _ProductRepository;

    public List<Product> findAll() {
        return _ProductRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> product = _ProductRepository.findById(id);
        return product.get();
    }

    public Product addProduct(Product _Product) {
        _ProductRepository.save(_Product);
        return _Product;
    }
}
