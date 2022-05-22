package business.concretes;

import business.abstracts.UserCheckInformationService;
import dataAccess.abstracts.UserDao;
import entities.User;

public class UserCheckInformation<T> implements UserCheckInformationService<User>{

	
	private UserDao<T> userDao;
	public UserCheckInformation(UserDao<T> userDao) {
		this.userDao=userDao;
	}
	@Override
	public boolean checkEmail(User user) {
		
		return false;
	}

	@Override
	public boolean checkPassword(User user) {
		
		return false;
	}

}
