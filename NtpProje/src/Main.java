import java.sql.SQLException;

import business.concretes.CompanyManager;
import business.concretes.CustomerManager;
import business.concretes.UserCheckInformation;
import dataAccess.concretes.DbHelper;
import dataAccess.concretes.MySqlProductDao;
import dataAccess.concretes.MysqlDaOForCompanyUser;
import dataAccess.concretes.MysqlDaoForCustomerUser;
import entities.Company;
import entities.Customer;
import entities.Product;
import entities.User;

public class Main {

	public static void main(String[] args) {
		DbHelper dbHelper = new DbHelper();
	try {
		
		dbHelper.getConnection();
		System.out.println("BAGLANDI");
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	Product product=new Product(1,"elma","20TL","30 Kg",1);
	Product product1=new Product(2,"2.elma","20TL","30 Kg",1);
	Product product2=new Product(3, "d�ner", "50", "s�nrs�z", 2);
	MySqlProductDao proDao=new MySqlProductDao();
	
	Company company=new Company();
	company.setEmail("iki");
	company.setCompanyName("ikinci �irket");
	company.setId(1);
	company.setPassword("2");
	Company company1= new Company();
	company1.setCompanyName("HepsiBurada");
	company1.setEmail("hepsiBurada@gmail.com");
	company1.setPassword("password");
	company1.setId(2);
	Customer customer1=new Customer();
	customer1.setId(1);
	customer1.setEmail("firstCustomer@gmail.com");
	customer1.setFirstName("first");
	customer1.setLastName("first");
	customer1.setPassword("first");
	
	Customer Faik=new Customer();
	Faik.setEmail("dasdad@gmail.com");
	Faik.setFirstName("faik");
	Faik.setId(5);
	Faik.setLastName("dasd");
	Faik.setPassword("asdas");
	MysqlDaOForCompanyUser<Company> daoCom=new MysqlDaOForCompanyUser<Company>();
	MysqlDaoForCustomerUser<Customer> daocUS=new MysqlDaoForCustomerUser<Customer>();

	


	UserCheckInformation<User> checkInformation=new UserCheckInformation();
	CompanyManager<Company> companyManager=new CompanyManager<Company>(daoCom,proDao,checkInformation);
	CustomerManager<Company> customerManager=new CustomerManager<Company>(daocUS,proDao,checkInformation);
	//companyManager.�r�nEkle(product2);
	//companyManager.�r�nEkle(product);
	//companyManager.�r�nEkle(product1);
	//customerManager.buyProduct(product1);
	//customerManager.showProducts();
	//customerManager.buyProduct(product);
	
	//customerManager.signUp(customer1);
	//customerManager.buyProduct(product2);
	//daoCom.add(company1);
	Customer customer2=new Customer();
	customer2.setId(2);
	customer2.setFirstName("ikinci");
	customer2.setLastName("ikinci");
	customer2.setEmail("ikinciCustomer@gmail.com");
	customer2.setPassword("asdasdsa");
	//customerManager.signUp(customer2);
	//companyManager.singIn(company1);
	customerManager.singIn(customer2);
	
	
	} 
	
}
