package business.concretes;

import java.util.regex.Pattern;

import business.abstracts.UserCheckInformationService;
import entities.User;

public class UserCheckInformation<T> implements UserCheckInformationService<User>{

	@Override
	public boolean checkEmail(User user) {
		String regex ="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern= Pattern.compile(regex, Pattern.CASE_INSENSITIVE); 
		
		if(user.getEmail().isEmpty()) {
			System.out.println("email alaný boþ býrakýlamaz");
			return false;
		}else {
			if((pattern.matcher(user.getEmail()).find()==false)) {
				System.out.println("Girilen email adresi formata uygun deðil. "
						+ "Örnek: ornek@ornek.com");
				return false;
			}
		
		}
		return true;
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().isEmpty()) {
			System.out.println("parola boþ býrakýlamaz");
			return false;
		}else {
			if(user.getPassword().length()<6) {
				System.out.println("parola 6 karekterden az olamaz");
				return false;
			}
		}
		return true;
	}

}
