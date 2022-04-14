package business.abstracts;

public interface UserManagerService<T> {
	void signUp(T userType);		
	void singIn(T userType);

}
