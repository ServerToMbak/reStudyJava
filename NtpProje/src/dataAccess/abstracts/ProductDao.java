package dataAccess.abstracts;

import entities.Product;

public interface ProductDao {
void showProducts();
void addProduct(Product product);
void deleteProduct(Product product);
void updateProduct(Product product);

}
