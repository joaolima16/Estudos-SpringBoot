package com.example.projetoTeste.joao.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoTeste.joao.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
