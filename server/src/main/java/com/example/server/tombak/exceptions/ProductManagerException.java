package com.example.server.tombak.exceptions;

import com.example.server.tombak.dataAccess.abstratcs.ProductDal;
import com.example.server.tombak.entities.Product;
public class ProductManagerException {
    
    private ProductDal productDal;
    
    public ProductManagerException(ProductDal productDal) {
        this.productDal = productDal;
    }
    
    public Product getProductById(int id) {
        try {
            return productDal.getById(id);
        } catch (Exception e) {
            // Handling the exception by printing the error message to the console
            System.out.println("Product not found: " + e.getMessage());
            return null;
        }
    }
    
    public void createProduct(Product product) {
        try {
            productDal.save(product);
        } catch (Exception e) {
            // Handling the exception by throwing a new RuntimeException with the original exception as its cause
            throw new RuntimeException("Failed to create : " + e.getMessage(), e);
        }
    }
    
    public void updateProduct(Product product) throws Exception {
        try {
            productDal.save(product);
        } catch (Exception e) {
            // Handling the exception by logging the error message to a file
           throw new Exception(e.getMessage());
        }
    }
    
 
}
