package business.abstracts;

import entities.concretes.User;

public interface UserService {
		void signup(User user);
		void signIn(User user);
	
}
