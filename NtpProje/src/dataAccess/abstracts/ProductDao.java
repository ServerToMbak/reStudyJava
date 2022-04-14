package dataAccess.abstracts;

import entities.Product;

public interface ProductDao {
	void showProducts();
void buyProduct(Product product);
 void addProduct(Product product);
 void DeleteProduct(Product product);
 void UpdateProduct(Product product);
}
