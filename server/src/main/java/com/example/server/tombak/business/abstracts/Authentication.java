package com.example.server.tombak.business.abstracts;

public abstract class Authentication {
	

	    public boolean login(String username, String password) {
	    	System.out.println("Yoı are in");
	    	return true;
	    }

	    public abstract boolean logout(String username);

	    public abstract boolean changePassword(String username, String oldPassword, String newPassword);

	

}
