import java.sql.SQLException;

import business.concretes.CompanyManager;
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
	Product product=new Product(1,"elma","20TL","30 Kg",2);
	MySqlProductDao proDao=new MySqlProductDao();
	//proDao.addProduct(product);
	//product.setProductName("elmadeðil");
	//proDao.UpdateProduct(product);
	Company company=new Company();
	company.setEmail("iki");
	company.setCompanyName("ikinci þirket");
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
	Customer customer2=new Customer();
	customer2.setId(2);
	customer2.setFirstName("ikinci");
	customer2.setLastName("ikinci");
	customer2.setEmail("ikinciCustomer@gmail.com");
	customer2.setPassword("ikinci");
	
		//System.out.println("Server e-ticaret sitesine hoþgeldiniz!!!! kayýt ol yada giriþ yap seçenekleriyle devam edebilisiniz");
		
	//	MysqlDaoForCustomer<Customer> daoCus=new MysqlDaoForCustomer<Customer>();
	MysqlDaOForCompanyUser<Company> daoCom=new MysqlDaOForCompanyUser<Company>();
	MysqlDaoForCustomerUser<Customer> daocUS=new MysqlDaoForCustomerUser<Customer>();
	//daocUS.add(customer1);
	//daocUS.add(customer2);
	customer2.setEmail("deðiþtirilen mail");
	//daocUS.update(customer2);
	daocUS.update(customer1);
	daocUS.update(customer2);
	daocUS.list();
//	daoCom.add(company1);
	//company1.setCompanyName("deðiþtirildi");
	//company1.setEmail(" deðiþtirildi");
	//daoCom.update(company1);
	//daoCom.add(company);
	daoCom.list();

	System.out.println("dasdasdsadas");
	UserCheckInformation<User> checkInformation=new UserCheckInformation(daoCom);
	CompanyManager<Company> c=new CompanyManager<Company>(daoCom,proDao,checkInformation);
	proDao.DeleteProduct(product);
	c.ürünEkle(product);
	//CustomerManager<Customer> userManager=new CustomerManager<Customer>(daoCus);		
	
	
	
//	Customer customer1=new Customer();
//	customer1.setEmail("customer1@gmail.com");
//	customer1.setPassword("password");
//	customer1.setFirstName("server");
//	customer1.setLastName("Tombak");
//
//	c.signUp(company1);
//	c.singIn(company1);
//	
//	Product product=new Product(1," Elma"," 20"," 5") ;
//	MySqlProductDao productDao=new MySqlProductDao();
//	ProductManager proMan=new ProductManager(productDao);
//	
//	
	//proMan.addProduct(product);
	//proMan.allProduct();
	//userManager.signUp(company1);
	//userManager.signUp(customer1);
	//dao.delete(customer1);
//	daoCom.add(company1);
	
	 // customer1.setEmail("customer212@gmail.com");
	
	 
	  //dao.update(company1);
	 // dao.update(customer1);
	 // daoCus.delete(customer1);
	  //daoCus.getAllUsers();
	
	 //company1.setEmail("hepsinerede215@gmail.com"); 
	 //daoCom.update(company1); 
	 //daoCom.delete(company1);
	
	
	}
	
}
