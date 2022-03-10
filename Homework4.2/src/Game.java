
public class Game {
	private int id;
	private String GameName;
	
	public Game() {
		
	}
	
	public Game(int id, String gameName) {
		this();
		this.id = id;
		GameName = gameName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return GameName;
	}

	public void setGameName(String gameName) {
		GameName = gameName;
	}
 
}
