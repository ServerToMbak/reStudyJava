package core;

import Check.CheckUser;

public class UserCheckServiceAdapter implements UserCheckService{

	CheckUser check =new CheckUser();
	@Override
	public void checkBySystem(String message) {
		System.out.println("user checked : " + message);
		
	}

}
