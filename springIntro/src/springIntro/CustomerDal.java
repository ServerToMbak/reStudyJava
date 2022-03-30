package springIntro;

public class CustomerDal implements CustomerDalService{
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	@Override
	public void add() {
		System.out.println("connection String" + getConnectionString() );
		System.out.println("oracle veritabanýna eklendi");
	}
}
