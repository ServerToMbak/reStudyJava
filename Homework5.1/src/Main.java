import business.concretes.UserCheckManager;
import business.concretes.UserManager;

public class Main {

	public static void main(String[] args) {
		Customer user = new Customer();
		user.setCustomerId(1);
		user.setFirstName("Soner");
		user.setLastName("Çelik");
		user.setEmail("sonercelik@hotmail.com");
		user.setPassword("123456");
		UserManager customerManager = new UserManagerC(new Ver);
	}

}
