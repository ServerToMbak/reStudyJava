package business.abstracts;

import entities.Customer;

public interface CustomerManagerService {
	void signUp(Customer customer);		
	void singIn(Customer customer);

}
