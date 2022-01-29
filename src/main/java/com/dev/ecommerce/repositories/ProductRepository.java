package com.dev.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.ecommerce.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
