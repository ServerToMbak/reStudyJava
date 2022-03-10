
public class GameManager {

	public void gameAdd(Game game) {
		System.out.println("game added :" + game.getGameName() );
	}
	public void gameDelete(Game game) {
		System.out.println("game added :" + game.getGameName() );
	}	
	
	public void gameSell(Game game,Customer customer) {
		System.out.println("game selled :" + game.getGameName() + " to " + customer.getFirstName());
	}
}
