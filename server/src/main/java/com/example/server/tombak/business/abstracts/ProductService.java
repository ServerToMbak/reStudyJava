package com.example.server.tombak.business.abstracts;

import java.util.List;

import com.example.server.tombak.entities.Product;

public interface ProductService {
	void add(Product product);
	void delete(int id);
	Product update(int id, Product product);
	Product get(int id);
	List<Product> getAll();
	List<Product> getAscendingProductName();
	List<Product> findAllByunitPriceBetween(double minPrice, double maxPrice);
}
