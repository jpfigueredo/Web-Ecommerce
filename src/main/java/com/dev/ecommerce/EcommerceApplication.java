package com.dev.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.ecommerce.entities.Category;
import com.dev.ecommerce.repositories.CategoryRepository;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

//	O que for implementado nele, será st
	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Electronics");
		Category cat2 = new Category(2L, "Books");

//		Injeção de dependencia em ação, armazenando na memória pela integração com a outra classe
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		
	}

}
