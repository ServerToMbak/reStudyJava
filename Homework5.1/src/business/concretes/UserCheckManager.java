package business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import business.abstracts.UserCheckService;
import entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	List<String> listOfEmail= new ArrayList<String>();
	@Override
	public boolean checkName(User user) {
		if(user.getName().isEmpty()) {
			System.out.println("isim boþ býrakýlamaz");
			return false;
		}else {
			if(user.getName().length()<3) {
				System.out.println("isim 2 karakterden daha küçük olamaz");
				return false;
			}
			return true;
		}
		
	}

	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().isEmpty()) {
			return false;
		}else {
			if(user.getLastName().length()<3) {
				System.out.println("soyisim 2 karakterden küçük olamaz");
				return false;
			}
		return true;
		}
	}

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
		return false;
	}

	@Override
	public boolean uniqueEmail(User user) {
		
		if(listOfEmail.contains(user.getEmail())) {
			System.out.println();
			return false;
			
		}else {
			listOfEmail.add(user.getEmail());
			return true;
		}
		
	
	}

	@Override
	public boolean isValid(User user) {
		if(checkName(user)&&checkLastName(user)&&checkEmail(user)&&
				checkPassword(user)&&uniqueEmail(user)==true) {
			return true;
		}
		return false;
	}
	
}
