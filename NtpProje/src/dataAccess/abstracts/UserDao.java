package dataAccess.abstracts;

public interface UserDao<T> {
	String mail(T UserType);
	String password(T UserType);
	void add(T Usertype) ;
	void delete(T Usertype);
	void update(T Usertype);
	void list(T usertype);
}
