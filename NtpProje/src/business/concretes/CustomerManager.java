package business.concretes;

import business.abstracts.UserManagerService;
import dataAccess.concretes.MysqlDaoForCustomer;
import entities.Customer;

public class CustomerManager<T> implements UserManagerService<Customer>{
	private MysqlDaoForCustomer<Customer> userDao;

	public CustomerManager() {
		 
	}
	
	public CustomerManager(MysqlDaoForCustomer userDao) {
		this();
		this.userDao = userDao;
	}


	@Override
	public void signUp(Customer customer) {
	
		userDao.add(customer);
		
	}
	

	@Override
	public void singIn(Customer customer) {
		if() {
			
		System.out.println("giri� yap�ld� se�emekleri g�ster");
		
		}
		
	}
}