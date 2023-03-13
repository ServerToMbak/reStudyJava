package com.example.server.tombak.dataAccess.abstratcs;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.server.tombak.entities.Product;

public interface ProductDal extends JpaRepository<Product,Integer> {

}