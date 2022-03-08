
public class Main {
	public static void main(String[] args) {
			User user1 =new User();
			user1.setFirstName("server");
			user1.setLastName("tombak");
			user1.setId(1);
			
			User user2 =new User();
			user2.setFirstName("faik");
			user2.setLastName("veznedaroğlu");
			user2.setId(2);
			
			UserManager userManager =new UserManager();
			userManager.addUser(user1);
			userManager.addUser(user2);
			
			
			Ders ders1=new Ders();
			ders1.setPriceOfders(20);
			ders1.setNameOfders("algoritma1");
			
			
			StudentManager studentManager =new StudentManager();
			studentManager.addClass(ders1);
			studentManager.deleteClass(ders1);
			
			InstructorManager instructorManager =new InstructorManager();			
			instructorManager.giveClass(ders1);
			instructorManager.overClass(ders1);
			

			
			
			
	}
}
