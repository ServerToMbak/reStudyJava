package com.example.server.tombak.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.server.tombak.business.abstracts.ProductService;
import com.example.server.tombak.dataAccess.abstratcs.ProductDal;
import com.example.server.tombak.entities.Product;

@Service
public class ProductManager implements ProductService{
	
	private ProductDal _productDal;
	
	@Autowired
	public  ProductManager(ProductDal productDal)
	{
		_productDal = productDal;
	}


	@Override
	public void add(Product product) {
		_productDal.save(product);
	}


	@Override
	public void delete(int id) {
		_productDal.deleteById(id);	
	}


	@Override
	public Product update(int id,Product newProduct) {
		Optional<Product> product = _productDal.findById(id);
		
		if(product.isPresent())
		{
			Product foundProduct = product.get();
			
			foundProduct.setCompanyId(newProduct.getCompanyId());
			foundProduct.setUnitprice(newProduct.getUnitprice());
			foundProduct.setProductName(newProduct.getProductName());
			foundProduct.setUnitsInStock(newProduct.getUnitsInStock());
				_productDal.save(foundProduct);
			return foundProduct;
		}
		else
			return null;
	}


	@Override
	public Product get(int id) 
	{//Custom Exception
		return _productDal.findById(id).orElse(null);
	}


	@Override
	public List<Product> getAll() {
		return _productDal.findAll();
	}
}
