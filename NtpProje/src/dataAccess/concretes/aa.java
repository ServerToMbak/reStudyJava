package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.Customer;

public class aa<T> implements UserDao<Customer>{
	ArrayList<Customer> customerList=new ArrayList<Customer>();
	@Override
	public void add(Customer customer) {
		customerList.add(customer);
		System.out.println(customer.getFirstName()+customer.getLastName()+ "kullanýcýs eklendi");
		
	}

	@Override
	public void delete(Customer customer) {
		customerList.remove(customer);
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
