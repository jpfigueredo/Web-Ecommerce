package com.dev.ecommerce.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.dev.ecommerce.entities.Category;

@Component
public class CategoryRepository {

	private Map<Long, Category> map = new HashMap<>();

	/*
	 * Salva objeto do tipo categoria em memória Chave = id, valor = obj
	 */
	public void save(Category obj) {
		map.put(obj.getId(), obj);
	}

	/* Informa a categoria pelo id */
	public Category findById(Long id) {
		return map.get(id);
	}

	/*
	 * Mostra a lista Instancia uma nova lista com os valores do mapa
	 */

	public List<Category> findAll() {
		return new ArrayList<Category>(map.values());
	}

}
