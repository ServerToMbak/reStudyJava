package com.example.server.tombak;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.server.tombak.Controllers.ProductsController;
import com.example.server.tombak.business.abstracts.ProductService;
import com.example.server.tombak.business.concretes.ProductManager;
import com.example.server.tombak.entities.Product;

@SpringBootTest
class ServerApplicationTests {

	private MockMvc mockMvc;
	
	
	@Test
	void testAddProduct() throws Exception {
		String productJson = "{ \"id\": 3, \"productName\": \"elma\", \"unitprice\": 11.0, \"unitsInStock\": 100, \"companyId\": 1 }";
		mockMvc.perform(MockMvcRequestBuilders
			      .post("/api/products/add")
			      .content(productJson)
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	
	@Test
	void testDeleteProduct() {
	    int productId = 3;
	    
	    
	    ProductManager productService = Mockito.mock(ProductManager.class);

	    
	    ProductsController productController = new ProductsController(productService);

	    productController.delete(productId);

	    
	    Mockito.verify(productService).delete(productId);
	}
	@Test
	void testUpdateProduct() {
	    int productId = 1;
	    Product updatedProduct = new Product(1, "updatedProduct", 10.0, 50, 1);
	    
	    // mock the productService
	    ProductService productService = Mockito.mock(ProductService.class);
	    Mockito.when(productService.update(productId, updatedProduct)).thenReturn(updatedProduct);

	    // create the controller and inject the mocked productService
	    ProductsController productController = new ProductsController(productService);

	    // call the update method
	    Product result = productController.update(productId, updatedProduct);

	    // verify that the productService's update method was called with the correct productId and updatedProduct
	    Mockito.verify(productService).update(productId, updatedProduct);

	    // assert that the returned Product object is the updatedProduct
	    assertEquals(updatedProduct, result);
	}

	
}
