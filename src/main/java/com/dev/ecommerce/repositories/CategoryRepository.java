package com.dev.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.ecommerce.entities.Category;

/* Implementa todas as funcionalidades do JpaRepository, save, findById, findAll, etc...*/
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
