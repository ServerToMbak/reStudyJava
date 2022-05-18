package business.concretes;

import business.abstracts.UserCheckInformationService;
import dataAccess.abstracts.UserDao;
import entities.User;

public class UserCheckInformation<T> implements UserCheckInformationService<User>{

	
	private UserDao<User> userDao;
	public UserCheckInformation(UserDao<User> userDao) {
		this.userDao=userDao;
	}
	@Override
	public boolean checkEmail(User user) {
		if(user.getEmail()==userDao.mail(user)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword()==userDao.password(user)) {
			return true;
		}
		return false;
	}

}
