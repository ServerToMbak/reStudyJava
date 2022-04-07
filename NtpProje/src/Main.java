import business.concretes.UserManager;
import dataAccess.concretes.MysqlDao;
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
	MysqlDao dao=new MysqlDao();
	
	UserManager userManager=new UserManager(dao);		

	Company company1= new Company();
	company1.setCompanyName("HepsiBurada");
	company1.setEmail("hepsiBurada@gmail.com");
	
	Customer customer1=new Customer();
	customer1.setEmail("customer1@gmail.com");
	customer1.setPassword("password");
	customer1.setFirstName("server");
	customer1.setLastName("Tombak");
	
	
	
	userManager.signUp(company1);
	userManager.signUp(customer1);

	dao.getAll();
	
	
	}
	
}
