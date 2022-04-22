package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.Customer;

public class MysqlDaoForCustomer<T> implements UserDao<Customer>{
	ArrayList<Customer> customerDao=new ArrayList<Customer>();
	
	@Override
	public void add(Customer customer)  {
	customerDao.add(customer);
		System.out.println("Database'e eklendi: "+customer.getEmail());
		
	}
	public void getAllUsers(Customer customer) {
		for(Customer customers:customerDao) {
			System.out.println(customers.getEmail()+" Id: "+customerDao.indexOf(customers));	
		}
		
	}


	@Override
	public void delete(Customer customer) {
		customerDao.remove(customer);
		System.out.println(customer.getEmail()+" mail adresli müsteri database'den silindi");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("database güncellendi");
		customer.setEmail(customer.getEmail());
		customer.setFirstName(customer.getFirstName());
		customer.setLastName(customer.getLastName());
		customer.setPassword(customer.getPassword());
		customerDao.set(customerDao.indexOf(customer),customer);
		System.out.println("güncellendi " + customer.getEmail()
		+customer.getFirstName()+customer.getLastName()+customer.getPassword());
		
	}

}
