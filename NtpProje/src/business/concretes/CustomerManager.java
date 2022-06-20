package business.concretes;

import java.util.Scanner;

import business.abstracts.UserManagerService;
import dataAccess.abstracts.ProductDao;
import dataAccess.concretes.MysqlDaoForCustomerUser;
import entities.Customer;
import entities.Product;


public class CustomerManager<T> implements UserManagerService<Customer>{
	Scanner girdi=new Scanner(System.in);
	private MysqlDaoForCustomerUser<Customer> userDao;
	private ProductDao productDao;
	private UserCheckInformation userCheckÝnformation;
	public CustomerManager() {
		
	}
	
	public CustomerManager(MysqlDaoForCustomerUser<Customer> userDao,ProductDao productDao,UserCheckInformation userCheckInformation) {
		this();
		this.userCheckÝnformation=userCheckInformation;
		this.productDao=productDao;
		this.userDao = userDao;
	}
	
	
	@Override
	public void signUp(Customer customer) {

		if((userCheckÝnformation.checkEmail(customer)&&userCheckÝnformation.checkPassword(customer))==true){
			
			System.out.println("Kayýt oldunuz alýþveriþe baþlayabilirsiniz"); 
			this.userDao.add(customer);
		}
		else
			signUp(customer);
		
	}

	@Override
	public boolean singIn(){
		String mail=girdi.next();
		String sifre=girdi.next();
		if(this.userDao.find(mail,sifre)==null) {
			System.out.println("giriþ bilgilerinde kullanýcý bulunamadý tekrar deneyiniz");
			System.exit(0);
		}if(this.userDao.find(mail,sifre) != null) {
			System.out.println("giriþ yapýldý");
			
		}
		return false;
	}

	@Override	
	public void update(Customer customer) {
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
		this.productDao.deleteProduct(product);
		System.out.println(product.getProductName()+"satýn alýndý iyi günlerde kullanýnýz ");
	}
}