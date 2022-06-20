package dataAccess.concretes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dataAccess.abstracts.ProductDao;
import entities.Product;

public class MySqlProductDao implements ProductDao{
	Connection connection=null;
	DbHelper helper=new DbHelper();
	PreparedStatement statement=null;
	Statement statementa=null;
	ResultSet resultSet;	
	@Override
	public void addProduct(Product product) {
		try {
			connection =helper.getConnection();  //dtaabase'e ba�lanma
			String sql="insert into product(id,productName,productPrice,stockAdeti,sirket�d) values(?,?,?,?,?)";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, product.getId());
			statement.setString(2, product.getProductName());
			statement.setInt(3, product.getProductPrice());
			statement.setInt(4, product.getStockAdeti());
			statement.setInt(5, product.getId());
			int result=statement.executeUpdate();
			System.out.println("�r�n database eklendi " + product.getProductName());
	
			
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);	
			
		}
		System.out.println("�r�n sepete eklendi" +product.getProductName());
		
	}

	@Override
	public void deleteProduct(Product product) {
		try {

			connection =helper.getConnection();
			String sql="delete from product where id=? ";//�al��t�raca��m�z sql kodu
			statement = connection.prepareStatement(sql);
			statement.setInt(1,product.getId());
			int result=statement.executeUpdate();
			System.out.println("�r�n database'den silindi");
	
			
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);	
			
		}
		System.out.println("�r�n silindi" + product.getProductName());
		
	}

	@Override
	public void updateProduct(Product product) {
		try {

			connection =helper.getConnection();
			String sql="update product set productName = ?, productPrice=?, stockAdeti=? where id = ? ";//�al��t�raca��m�z sql kodu
			
			statement = connection.prepareStatement(sql);
			statement.setString(1, product.getProductName());
			statement.setInt(2, product.getProductPrice());
			statement.setInt(3, product.getStockAdeti());
			statement.setInt(4, product.getId());
			int result=statement.executeUpdate();
			System.out.println("�r�n g�ncellendi");
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);	
			}	
	}
	@Override
	public void showProducts() {
		try {
			ArrayList<Product> productList = new ArrayList<Product>();
			connection =helper.getConnection();
			statementa = connection.createStatement();
			resultSet=statementa.executeQuery("select id,productName,productPrice,stockAdeti,sirket�d from product");
			while(resultSet.next()) {
				productList.add(new Product(
						resultSet.getInt("id"),
						resultSet.getString("productName"),
						resultSet.getInt("productPrice"),
						resultSet.getInt("stockAdeti"),
						resultSet.getInt("sirket�d")));
			}
			System.out.println("-----------------�r�nler------------------------");
			for(Product product: productList) {
				System.out.println(product.getId()+" "+product.getProductName());
			}
			System.out.println("Toplam �r�n say�s�");
			System.out.println(productList.size());
			
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);	
			System.out.println(exception.getMessage());
		}
	}
}
