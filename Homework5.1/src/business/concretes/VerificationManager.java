package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.VerificationService;
import entities.concretes.User;

public class VerificationManager implements VerificationService {
	List<String> verificatedEmails =new ArrayList<String>();
	@Override	
	public void verifyMail(User user) {
		verificatedEmails.add(user.getEmail());
		System.out.println("baþarýyla doðrulandý.");
	}

	@Override
	public void sendToVerifyMail(User user) {
		System.out.println(user.getEmail() +"dogrulama mail yollandý");
		
	}

	@Override
	public boolean checkVerifyAccount(User user) {
		if(verificatedEmails.contains(user.getEmail())) {
			return true;
		}
		return false;
	}

}
