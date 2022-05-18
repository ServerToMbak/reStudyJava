package business.abstracts;

public interface UserCheckInformationService<User> {
	boolean checkEmail(User user);
	boolean checkPassword(User user);
}
