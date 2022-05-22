package business.concretes;

import business.abstracts.UserManagerService;
import dataAccess.abstracts.ProductDao;
import dataAccess.concretes.MysqlDaoForCustomerUser;
import entities.Customer;
import entities.Product;


public class CustomerManager<T> implements UserManagerService<Customer>{
	String emaail;
	String password;
	private MysqlDaoForCustomerUser<Customer> userDao;
	private ProductDao productDao;
	public CustomerManager() {
		
	}
	
	public CustomerManager(MysqlDaoForCustomerUser<Customer> userDao,ProductDao productDao) {
		this();
		this.productDao=productDao;
		this.userDao = userDao;
	}
	@Override
	public void signUp(Customer customer) {
		this.userDao.add(customer);
		System.out.println("Kay�t oldunuz al��veri�e ba�layabilirsiniz");
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
	public void showProducts() {
		this.productDao.showProducts();
		
	}
	public void buyProduct(Product product) {
		this.productDao.DeleteProduct(product);
		System.out.println(product.getProductName()+"sat�n al�nd� iyi g�nlerde kullan�n�z ");
	}
}