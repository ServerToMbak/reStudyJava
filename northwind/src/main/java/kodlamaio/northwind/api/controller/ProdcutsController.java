package kodlamaio.northwind.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstratcs.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProdcutsController {
	
	private ProductService productService;
	
	
	@Autowired
	public ProdcutsController(ProductService productService) {
		super();
		this.productService = productService;
	}



	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}
