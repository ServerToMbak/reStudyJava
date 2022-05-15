package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.Customer;

public class MysqlDaoForCustomer<T> implements UserDao<Customer>{
	ArrayList<Customer> customerList=new ArrayList<Customer>();
	
	@Override
	public void add(Customer customer)  {
	customerList.add(customer);
		System.out.println("Database'e eklendi: "+customer.getEmail());
		
	}
	public void getAllUsers(Customer customer) {
		for(Customer customers:customerList) {
			System.out.println(customers.getEmail()+" Id: "+customerList.indexOf(customers));	
		}
		
	}


	@Override
	public void delete(Customer customer) {
		customerList.remove(customer);
		System.out.println(customer.getEmail()+" mail adresli müsteri 	silindi");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("database güncellendi");
		customer.setEmail(customer.getEmail());
		customer.setFirstName(customer.getFirstName());
		customer.setLastName(customer.getLastName());
		customer.setPassword(customer.getPassword());
		customerList.set(customerList.indexOf(customer),customer);
		System.out.println("güncellendi " + customer.getEmail()
		+customer.getFirstName()+customer.getLastName()+customer.getPassword());
		
	}
	@Override
	public void list(Customer customer) {
		//customer.getEmail()
		
	}
	@Override
	public String mail(Customer customer) {
		
		return customer.getEmail();
	}
	@Override
	public String password(Customer customer) {
		
		return customer.getPassword();
	}

}
