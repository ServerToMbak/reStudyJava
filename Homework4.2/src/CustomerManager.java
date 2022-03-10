
public class CustomerManager {
	private CheckCustomer[] checkCustomers;

	public CustomerManager(CheckCustomer[] checkCustomers) {
		this.checkCustomers = checkCustomers;
	}
	
	public void add(Customer customer) {	
		Utils.runCheckCustomer(checkCustomers);
		System.out.println("Customer added: " + customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		Utils.runCheckCustomer(checkCustomers);
		System.out.println("customer deleted: " + customer.getFirstName());
	}
	
	public void update(Customer customer) {
		Utils.runCheckCustomer(checkCustomers);
		System.out.println("customer updated: " + customer.getFirstName());
	}
}
