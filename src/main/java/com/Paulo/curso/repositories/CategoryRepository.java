package com.Paulo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Paulo.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
