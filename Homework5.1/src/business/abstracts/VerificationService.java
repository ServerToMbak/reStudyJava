package business.abstracts;

import entities.concretes.User;

public interface VerificationService {
	void verifyMail(User user);
	void sendToVerifyMail(User user); 
	boolean checkVerifyAccount(User user);
}
