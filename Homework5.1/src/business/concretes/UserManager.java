package business.concretes;

import business.abstracts.UserCheckService;
import business.abstracts.UserService;
import business.abstracts.VerificationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private UserCheckService UserCheckService;
	private VerificationService mailVerificationService;
	
	
	public UserManager(UserDao userDao,
			UserCheckService UserCheckService,
			VerificationService mailVerificationService)
	{
		this.userDao=userDao;
		this.mailVerificationService=mailVerificationService;
		this.UserCheckService=UserCheckService;
		
	}
	
	@Override
	public void signup(User user) {
		if (UserCheckService.isValid(user) == true) {
			System.out.print(user.getName() + " kullanýcýsý baþarýyla sisteme eklendi.\n");
			mailVerificationService.sendToVerifyMail(user);
			userDao.add(user);
		}
		
	}

	@Override
	public void signin(User user) {
		// TODO Auto-generated method stub
		
	}

}
