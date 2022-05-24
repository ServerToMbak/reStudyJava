package business.abstracts;

public interface UserCheckInformationService<T> {
	boolean checkEmail(T user);
	boolean checkPassword(T user);
}
