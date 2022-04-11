package business.concretes;

import business.abstracts.CustomerManagerService;
import dataAccess.abstracts.UserDao;
import entities.Customer;

public class UserManager implements CustomerManagerService{
	private UserDao userDao;

	public UserManager() {
		 
	}
	
	public UserManager(UserDao userDao) {
		this();
		this.userDao = userDao;
	}


	@Override
	public void signUp(Customer customer) {
	
		userDao.add(customer);
		
	}


	@Override
	public void singIn(Customer customer) {
		/*
		 * if(customer.getEmail().isEmpty()&&customer.getPassword()) {
		 * 
		 * }
		 */
		
	}
		
}
