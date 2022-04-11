package dataAccess.concretes;

import java.util.ArrayList;
import dataAccess.abstracts.UserDao;
import entities.Customer;

public class MysqlDaoForCustomer<T> implements UserDao<Customer>{
	ArrayList<Customer> userList=new ArrayList<Customer>();
	
	@Override
	public void add(Customer customer)  {
	userList.add(customer);
		System.out.println("eklendi: "+customer.getEmail());
		
	}
	public void getAllUsers() {
		for(Customer customers:userList) {
			
			System.out.println(customers.getEmail()+" Id: "+userList.indexOf(customers));
			
		}
	}

	@Override
	public void delete(Customer customer) {
		userList.remove(customer);
		System.out.println(customer.getEmail()+" mail adresli müsteri silindi");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("güncellendi");
		customer.setEmail(customer.getEmail());
		customer.setFirstName(customer.getFirstName());
		customer.setLastName(customer.getLastName());
		customer.setPassword(customer.getPassword());
		userList.set(userList.indexOf(customer),customer);
		System.out.println("güncellendi " + customer.getEmail()
		+customer.getFirstName()+customer.getLastName()+customer.getPassword());
		
	}

}
