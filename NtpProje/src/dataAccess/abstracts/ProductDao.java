package dataAccess.abstracts;

import entities.Product;

public interface ProductDao {
void showProducts();
void addProduct(Product product);
void DeleteProduct(Product product);
void UpdateProduct(Product product);
}
