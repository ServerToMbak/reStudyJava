package business.concretes;

import business.abstracts.UserManagerService;
import dataAccess.concretes.MysqlDaoForCustomer;
import entities.Customer;


public class CustomerManager<T> implements UserManagerService<Customer>{
	String emaail;
	String password;
	private MysqlDaoForCustomer<Customer> userDao;

	public CustomerManager() {
		 
	}
	
	public CustomerManager(MysqlDaoForCustomer userDao) {
		this();
		this.userDao = userDao;
	}


	@Override
	public void signUp(Customer customer) {
	
		System.out.println("kay�t ba�ar�yla Tamamland�");
		this.userDao.add(customer);

	}

	@Override
	public void singIn(Customer customer) {
		System.out.println("sisteme giri� i�in email adresinizi ve �ifrenizi s�ras�yla giriniz");
		if(customer.getEmail()==this.emaail) {
			System.out.println("giri� ba�ar�l�");
		}
	}

	@Override
	public void Update(Customer customer) {
		this.userDao.update(customer);
	}

	@Override
	public void deleteAccount(Customer customer) {
		this.userDao.delete(customer);
		
	}
}