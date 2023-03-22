	package com.example.server.tombak.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.server.tombak.business.abstracts.ProductService;
import com.example.server.tombak.entities.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController{
	
	private ProductService productService;
	
	public ProductsController (ProductService productService) {
		this.productService = productService;
	}
	
	
	@GetMapping
	public List<Product> getAll()
	{
		return this.productService.getAll();
	}
	@PostMapping
	public void Add(@RequestBody Product product)
	{
		this.productService.add(product);
	}
	@GetMapping("/{productId}")
	public Product get(@PathVariable int productId)
	{
		return this.productService.get(productId);
	}	
	@PutMapping("/{productId}")
	public Product update(@PathVariable int productId, @RequestBody Product newProduct) 
	{	
		return this.productService.update(productId, newProduct);
		
	}
	@DeleteMapping("/{productId}")
	public void delete(@PathVariable int productId)
	{
		this.productService.delete(productId);
	}
	
	
	
	
}
