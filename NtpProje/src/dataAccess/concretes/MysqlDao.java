package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.User;

public class MysqlDao implements UserDao{
	ArrayList<String> userList=new ArrayList<String>();
	
	@Override
	public void add(User user)  {
	userList.add(user.getEmail());
		System.out.println("eklendi: "+user.getEmail());
		
	}
	public void getAll() {
		for(String email:userList) {
			
			System.out.println(email+userList.indexOf(email));
		}
	}

	@Override
	public void delete(User user) {
		
		System.out.println("silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println("güncellendi");
		
	}

}
