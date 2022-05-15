package business.concretes;

import business.abstracts.ProductManagerService;
import dataAccess.abstracts.ProductDao;
import entities.Product;

public class ProductManager implements ProductManagerService{
	private ProductDao productDao;
	
	public ProductManager(ProductDao ProductDao) {
		this.productDao=ProductDao;
	}
	@Override
	public void buyProductS(Product product) {
		this.productDao.DeleteProduct(product);
		
	}

	@Override
	public void allProduct() {
		System.out.println("Tüm Ürünler Gösteriliyor");
		this.productDao.showProducts();
		
	}
	@Override
	public void addProduct(Product product) {
		this.productDao.addProduct(product);		
	}

}
