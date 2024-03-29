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
			System.out.print(user.getName() + " kullan�c�s� ba�ar�yla sisteme eklendi.\n");
			mailVerificationService.sendToVerifyMail(user);
			userDao.add(user);
		}
		
	}

	@Override
	public void signIn(User user) {
		mailVerificationService.verifyMail(user);
		if(userDao.getEmail(user.getEmail())&&userDao.getPassword
		(user.getPassword())&&mailVerificationService.checkVerifyAccount(user)==true ) 
			System.out.println("giri� ba�ar�l�"); 
				else if(mailVerificationService.checkVerifyAccount(user)){
					System.out.println("Kullanc�� bilgileri do�ru ama mail adresi do�rulanamd��� i�in giri� yap�lam�yor.");
			
		}else {
			System.out.println("giri� ba�ar�s�z");
		}
		
		
		
	}

}
