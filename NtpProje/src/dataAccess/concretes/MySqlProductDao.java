package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.ProductDao;
import entities.Product;

public class MySqlProductDao implements ProductDao{
	ArrayList<Product> productList = new ArrayList<Product>();
	@Override
	public void addProduct(Product product) {
		productList.add(product);
		System.out.println("ürün sepete eklendi" +product.getProductName());
		
	}

	@Override
	public void DeleteProduct(Product product) {
		productList.remove(product);
		System.out.println("ürün silindi" + product.getProductName());
		
	}

	@Override
	public void UpdateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void showProducts() {
		for(Product product: productList) {
			System.out.println("ürün Id:" + product.getId()+" ürün adý:"+product.getProductName()+" ürün fiyatý:" + product.getProductPrice() +" stock adedi:" +product.getStockAdeti() );
		}
		
	}


}
