package dataAccess.abstracts;

public interface UserDao<T> {
	
	void add(T Usertype) ;
	void delete(T Usertype);
	void update(T Usertype);
	void getAll();
	T find(String email,String password);

}
