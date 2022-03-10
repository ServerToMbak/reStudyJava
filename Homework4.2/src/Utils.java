
public class Utils {
	public static void runCheckCustomer(CheckCustomer[] checkCustomers) {
		for(CheckCustomer checkCustomer: checkCustomers) {
			checkCustomer.check();
		}
	}
}
