
public class Main {

	public static void main(String[] args) {
	
		Customer customerý=new Customer(1,"server","tombak");
		
		CheckCustomer[] checkCustomers= {new CheckWithId(),new CheckWithfirstName(),new CheckWithLastName()};
		
		CustomerManager customerManager=new CustomerManager(checkCustomers);
		customerManager.add(customerý);
		Game csgo=new Game(1,"csgo");
		GameManager gameManager=new GameManager();
		gameManager.gameSell(csgo, customerý);
	}

}
