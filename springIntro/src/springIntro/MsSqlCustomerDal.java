package springIntro;

public class MsSqlCustomerDal implements CustomerDalService{
	 String connectionString;
		
		public String getConnectionString() {
			return connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}
	@Override
	public void add() {
		System.out.println("ms sql veritaban�na eklendi");
		System.out.println("connection String" + getConnectionString() );
	}

}
