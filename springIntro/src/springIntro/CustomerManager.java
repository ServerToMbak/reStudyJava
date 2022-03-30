package springIntro;

public class CustomerManager implements CustomerService{
	private CustomerDalService dalService;
	
	public CustomerManager(CustomerDalService dalService) {
		this.dalService = dalService;
	}

	public void add() {
	
		dalService.add();
	}
}
