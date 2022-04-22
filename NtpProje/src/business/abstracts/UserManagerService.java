package business.abstracts;

public interface UserManagerService<T> {
	void signUp(T userType);		
	void singIn(T userType);
	void Update(T userType);
	void deleteAccount(T userType);

}
