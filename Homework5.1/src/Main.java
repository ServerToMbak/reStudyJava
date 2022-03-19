import business.concretes.UserManager;
import core.UserCheckService;
import core.UserCheckServiceAdapter;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao=new HibernateUserDao();
		UserCheckService checkService=new UserCheckServiceAdapter();
		
		UserManager userManager=new UserManager(userDao,checkService);
		
		User user =new User(1,"server","server","email","password");
		userManager.add(user);
	}

}
