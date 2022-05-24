package dataAccess.concretes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.Customer;

public class MysqlDaoForCustomerUser<T> implements UserDao<Customer>{
	
	Connection connection=null;
	DbHelper helper=new DbHelper();
	PreparedStatement statement=null;
	Statement statementa=null;
	ResultSet resultSet;	

		
	@Override
	public void add(Customer customer)  {
		try {
			connection =helper.getConnection();  //dtaabase'e baðlanma
			String sql="insert into customer(id,email,password,firstName,lastName) values(?,?,?,?,?)";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, customer.getId());
			statement.setString(2, customer.getEmail());
			statement.setString(3, customer.getPassword());
			statement.setString(4, customer.getFirstName());
			statement.setString(5, customer.getLastName());
			int result=statement.executeUpdate();
			
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);	
			
		}
		System.out.println(customer.getEmail()+" Mail adresli kullanýcý database eklendi");
		
	}
	


	@Override
	public void delete(Customer customer) {
		try {

			connection =helper.getConnection();
			String sql="delete from customer where id=? ";//çalýþtýracaðýmýz sql kodu
			statement = connection.prepareStatement(sql);
			statement.setInt(1,customer.getId());
			int result=statement.executeUpdate();
			System.out.println("kayýt database'den silindi");
	
			
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);	
			
		}
		System.out.println(customer.getEmail()+" Mail adresli müsteri dataabse'den silindi");
		
	}

	@Override
	public void update(Customer customer) {
		try {

			connection =helper.getConnection();
			String sql="update customer set firstName = ?,lastName=?, Email=?, password=? where id = ? ";//çalýþtýracaðýmýz sql kodu
			
			statement = connection.prepareStatement(sql);
			statement.setString(1, customer.getFirstName());
			statement.setString(2, customer.getLastName());
			statement.setString(3,	customer.getEmail());
			statement.setString(4, customer.getPassword());
			statement.setInt(5, customer.getId());
			int result=statement.executeUpdate();
			System.out.println("Müþteri database'de güncellendi");
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);	
			}
		
	}
	@Override
	public void getAll() {
		try {
			ArrayList<Customer> customerList=new ArrayList<Customer>();

			connection =helper.getConnection();
			statementa = connection.createStatement();
			resultSet=statementa.executeQuery("select id,firstName,lastName,Email,password from customer");
			
			
			while(resultSet.next()) {
				customerList.add(new Customer(
						resultSet.getInt("id"),
						resultSet.getString("firstName"),
						resultSet.getString("lastName"),
						resultSet.getString("email")));
				
			}
			System.out.println("-----------------Veri tabanýndaki müþteri Listesi------------------------");
			for(Customer customer: customerList) {
				System.out.println(customer.getId()+customer.getEmail()+customer.getFirstName()+customer.getLastName());
			}
			System.out.println("Toplam Müþteri Sayýsý");
			System.out.println(customerList.size());
			
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);	
			System.out.println(exception.getMessage());
		}
		
	}



	public Customer find(String email,String password) {
		Customer customer=null;
		try {
		connection=helper.getConnection();
		String sorgu="select * FROM customer where email=? and password =?";
		statement=connection.prepareStatement(sorgu);
		statement.setString(1, email);
		statement.setString(2, password);
		resultSet=statement.executeQuery();
		
		if(resultSet.next()) {
			customer=new Customer();
			customer.setId(resultSet.getInt("ÝD"));
			customer.setEmail(resultSet.getString("email"));
			customer.setFirstName(resultSet.getString("firstName"));
			customer.setLastName(resultSet.getString("lastName"));
			customer.setPassword(resultSet.getString("password"));
		}
		
		}
		catch(SQLException exception) {
			helper.showErrorMessage(exception);	
			System.out.println(exception.getMessage());
		}
		return customer;
	}

}
