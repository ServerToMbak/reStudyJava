package business.abstracts;

import entities.User;

public interface UserManagerService {
	void signUp(User user);		
	void singIn(User user);

}
