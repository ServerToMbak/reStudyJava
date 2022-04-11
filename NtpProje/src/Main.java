import business.concretes.UserManager;
import dataAccess.concretes.MysqlDaOForCompany;
import dataAccess.concretes.MysqlDaoForCustomer;
import entities.Company;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		/*		Customer user1 = new Customer();
		DbHelper dbHelper = new DbHelper();
	
	try {
		
		dbHelper.getConnection();
		System.out.println("BAGLANDI");
		UserDao dao=new MysqlDao();
		dao.add(user1);
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

	*/
	MysqlDaoForCustomer<Customer> daoCus=new MysqlDaoForCustomer<Customer>();
	MysqlDaOForCompany<Company> daoCom=new MysqlDaOForCompany<Company>();
	
	UserManager userManager=new UserManager(daoCus);		

	Company company1= new Company();
	company1.setCompanyName("HepsiBurada");
	company1.setEmail("hepsiBurada@gmail.com");
	company1.setPassword("password");
	
	Customer customer1=new Customer();
	customer1.setEmail("customer1@gmail.com");
	customer1.setPassword("password");
	customer1.setFirstName("server");
	customer1.setLastName("Tombak");

	
	
	//userManager.signUp(company1);
	userManager.signUp(customer1);
	//dao.delete(customer1);
	daoCom.add(company1);
	
	 // customer1.setEmail("customer212@gmail.com");
	
	 
	  //dao.update(company1);
	 // dao.update(customer1);
	  daoCus.delete(customer1);
	  daoCus.getAllUsers();
	
	 company1.setEmail("hepsinerede215@gmail.com"); 
	 daoCom.update(company1); 
	 daoCom.delete(company1);
	
	}
	
}
