package business.abstracts;

import entities.User;

public interface UserCheckInformationService {
	boolean checkEmail(User user);
	boolean checkPassword(User user);
}
