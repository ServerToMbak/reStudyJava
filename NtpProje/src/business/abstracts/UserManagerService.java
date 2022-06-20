package business.abstracts;

public interface UserManagerService<T> {
	void signUp(T userType);		
	boolean singIn();
	void update(T userType);
	void deleteAccount(T userType);

}
