package business.concretes;

import business.abstracts.UserManagerService;
import dataAccess.abstracts.UserDao;
import entities.User;

public class UserManager implements UserManagerService{
	private UserDao userDao;

	public UserManager() {
		
	}
	
	public UserManager(UserDao userDao) {
		this();
		this.userDao = userDao;
	}


	@Override
	public void signUp(User user) {
	
		userDao.add(user);
		
	}


	@Override
	public void singIn(User user) {
		
		
	}
		
}
