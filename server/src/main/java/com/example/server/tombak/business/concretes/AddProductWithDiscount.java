package com.example.server.tombak.business.concretes;

import com.example.server.tombak.dataAccess.abstratcs.ProductDal;
import com.example.server.tombak.entities.Product;

public class AddProductWithDiscount extends ProductManager {

	
	public AddProductWithDiscount(ProductDal productDal) {
		super(productDal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Product product) {
		 double discountedPrice = product.getUnitprice() * 0.9;
        product.setUnitprice(discountedPrice);
        super.add(product);
	}
	

}
