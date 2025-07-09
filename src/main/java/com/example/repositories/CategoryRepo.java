package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entites.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
