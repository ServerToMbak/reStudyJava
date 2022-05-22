package dataAccess.abstracts;

public interface UserDao<T> {
	
	void add(T Usertype) ;
	void delete(T Usertype);
	void update(T Usertype);
	void getAll();
	void find(T Usertype);

}
