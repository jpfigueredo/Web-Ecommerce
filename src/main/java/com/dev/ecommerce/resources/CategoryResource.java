package com.dev.ecommerce.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.ecommerce.entities.Category;
import com.dev.ecommerce.repositories.CategoryRepository;

// Define padrões Rest e à qual parametro responde
@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

//	injeção de dependencia
//	Só funciona com Component
	@Autowired
	private CategoryRepository categoryRepository;

//	Método instancia uma resposta dando OK, 200
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = categoryRepository.findAll();
		return ResponseEntity.ok().body(list);
	}

	/*
	 * No caminho, será / e um ID aleatório | Ex: /1 = list[1] Variavel 1 vai
	 * encontrar o @PathVariable | Acha e pega
	 */
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category category = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(category);
	}

}
