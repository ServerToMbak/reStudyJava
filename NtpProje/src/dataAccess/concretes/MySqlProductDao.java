package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.ProductDao;
import entities.Product;

public class MySqlProductDao implements ProductDao{
	ArrayList<Product> productList = new ArrayList<Product>();
	@Override
	public void addProduct(Product product) {
		productList.add(product);
		System.out.println("�r�n sepete eklendi" +product.getProductName());
		
	}

	@Override
	public void DeleteProduct(Product product) {
		productList.remove(product);
		System.out.println("�r�n silindi" + product.getProductName());
		
	}

	@Override
	public void UpdateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void showProducts() {
		for(Product product: productList) {
			System.out.println("�r�n Id:" + product.getId()+" �r�n ad�:"+product.getProductName()+" �r�n fiyat�:" + product.getProductPrice() +" stock adedi:" +product.getStockAdeti() );
		}
		
	}


}
