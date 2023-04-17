package com.example.server.tombak.dataAccess.abstratcs;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.server.tombak.entities.Product;

public interface ProductDal extends JpaRepository<Product,Integer> {
 List<Product> findAllByunitpriceBetween(double minPrice, double maxPrice);
}