package springIntro;

public class MysqlCustomerDal implements CustomerDalService{

	 String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println("mysql veritabanýna eklendi");
		System.out.println("Conenction String" + getConnectionString());
	}

}
