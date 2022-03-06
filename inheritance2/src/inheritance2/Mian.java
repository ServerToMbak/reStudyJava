package inheritance2;

public class Mian {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
			customerManager.add(new FileLogger());
			
			DatabaseLogger databaseLogger=new DatabaseLogger();
			customerManager.add(databaseLogger);
	}

}
