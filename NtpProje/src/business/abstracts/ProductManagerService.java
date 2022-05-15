package business.abstracts;

import entities.Product;

public interface ProductManagerService {
	void addProduct(Product product);
	void buyProductS(Product product);
	void allProduct(); 
}
