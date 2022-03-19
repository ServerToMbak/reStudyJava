package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import core.UserCheckService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private UserCheckService checkService;
	
	public UserManager(UserDao userDao,UserCheckService checkService) {
		this.userDao=userDao;
		this.checkService=checkService;
	}
	
	@Override
	public void add(User user) {
		if(user.getName().length()>2 && user.getLastName().length()>2 
				&& user.getPassword().length()>=6) {
			userDao.add(user);
			checkService.checkBySystem(user.getName());
		}
		else
			System.out.println("kullan�c� ekleme i�lemi ba�ar�s�z isim ve soyisim 2 karakterden fazla"
					+ "ve parola en az 6 karakterden olu�mal�d�r. Kontrol edip tekrar deneyiniz");
	
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
