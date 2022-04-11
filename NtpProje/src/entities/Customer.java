package entities;

public class Customer extends User{
	String firstName;
	String lastName;
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Customer() {
 
	}
	public Customer(String email,String firstName, String lastName) {
		this();
		this.email=email;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	
}
