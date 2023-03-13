import java.sql.SQLException;
import java.util.Scanner;

import business.concretes.CompanyManager;
import business.concretes.CustomerManager;
import business.concretes.UserCheckInformation;
import dataAccess.concretes.DbHelper;
import dataAccess.concretes.MySqlProductDao;
import dataAccess.concretes.MysqlDaOForCompanyUser;
import dataAccess.concretes.MysqlDaoForCustomerUser;
import entities.Company;
import entities.Customer;
import entities.Product;
import entities.User;
public class Main {
	public static void main(String[] args) {
		DbHelper dbHelper = new DbHelper();
	try {
		dbHelper.getConnection();
		System.out.println("BAGLANDI");
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}	
	Scanner girdi=new Scanner(System.in);
	MySqlProductDao proDao=new MySqlProductDao();
	MysqlDaOForCompanyUser<Company> daoCom=new MysqlDaOForCompanyUser<Company>();
	MysqlDaoForCustomerUser<Customer> daocUS=new MysqlDaoForCustomerUser<Customer>();
	UserCheckInformation<User> checkInformation=new UserCheckInformation();
	CompanyManager<Company> companyManager=new CompanyManager<Company>(daoCom,proDao,checkInformation);
	CustomerManager<Company> customerManager=new CustomerManager<Company>(daocUS,proDao,checkInformation);
	Company company2=new Company();
	Product product=new Product();
	company2.setEmail("iki");
	company2.setCompanyName("ikinci �irket");
	company2.setId(1);
	company2.setPassword("2");
	Company company1= new Company();
	company1.setCompanyName("HepsiBurada");
	company1.setEmail("hepsiBurada@gmail.com");
	company1.setPassword("password");
	company1.setId(2);

	Customer customer2=new Customer();
	customer2.setId(2);
	customer2.setFirstName("ikinci");
	customer2.setLastName("ikinci");
	customer2.setEmail("ikinciCustomer@gmail.com");
	customer2.setPassword("asdasdsa");
	
	boolean giris=companyManager.singIn();
	
	if(giris==true) {
		System.out.println("giri� ba�ar�l�...");
		System.out.println("Yapmak istedi�iniz i�lemi se�iniz.\n1.�r�n ekle"
				+ "\n2.�r�n bilgilerini g�ncelle"
				+"\n3.�r�n Sil"
				+ "\n4.Hesap ��lemleri");
		int a=girdi.nextInt();
		if(a==1) {
			
			companyManager.�r�nEkle(company1, product);
		}if(a==2) {
			
		}if(a==3) {
			
		}
	}if(giris==false) {
		System.out.println("��k�� Yap�lm��t�r...");
		
		System.exit(0);
	}
	
	/*
	 * Scanner girdi=new Scanner(System.in);
	 * 
	 * 
	 * System.out.
	 * println("E�er hesab�n�z varsa giri� yapmak i�in 1'e bas�n�z yoksa kay�t olu�turmak i�in 2'ye bas�n�z"
	 * );
	 * 
	 * int a=girdi.nextInt();
	 * 
	 * if(a==1) {
	 * System.out.println("�irket giri�i i�in 1'e m��teri giri�i i�in 2'ye bas�n�z"
	 * ); int sonuc=girdi.nextInt();
	 * 
	 * 
	 * if(sonuc==1) { System.out.println("mail adresinizi giriniz"); String
	 * mail=girdi.next(); System.out.println("�ifre giriniz"); String
	 * sifre=girdi.next(); companyManager.singIn();
	 * System.out.println("�r�n eklemek i�in 1");
	 * System.out.println("�r�n silmek i�in 2");
	 * System.out.println("�r�n g�ncellemek i�in 3'e bas�n�z");
	 * System.out.println("T�m �r�nleri g�r�nt�lemek i�in 4'e bas�n�z");
	 * 
	 * int secim=girdi.nextInt(); if(secim==1) { Product product=new Product();
	 * System.out.println("Eklenecek �r�n�n Id'sini yaz�n�z");
	 * product.setId(girdi.nextInt());
	 * System.out.println("Eklenecek �r�n�n ismini giriniz");
	 * product.setProductName(girdi.next());
	 * System.out.println("Eklenecek �r�n�n Fiyat�n� giriniz");
	 * product.setProductPrice(girdi.nextInt());
	 * System.out.println("Eklenecek �r�n�n stok adetini giriniz");
	 * product.setStockAdeti(girdi.nextInt()); companyManager.�r�nEkle(product);
	 * 
	 * }if(secim==2) { Product product=new Product();
	 * System.out.println("silece�iniz �r�n�n Id'sini giriniz");
	 * product.setId(girdi.nextInt()); companyManager.�r�nSil(product);
	 * 
	 * 
	 * }if(secim==3) { Product product1=new Product();
	 * System.out.println("G�ncellenecek �r�n�n Id'sini yaz�n�z");
	 * product1.setId(girdi.nextInt());
	 * System.out.println("G�ncellenecek �r�n�n ismini giriniz");
	 * product1.setProductName(girdi.next());
	 * System.out.println("G�ncellenecek �r�n�n Fiyat�n� giriniz");
	 * product1.setProductPrice(girdi.nextInt());
	 * System.out.println("G�ncellenecek �r�n�n stok adetini giriniz");
	 * product1.setStockAdeti(girdi.nextInt());
	 * companyManager.�r�nG�ncelle(product1);
	 * 
	 * }if(secim==4) { companyManager.t�m�r�nlerim(); }
	 * 
	 * } if(sonuc==2) { System.out.println("mail adresinizi giriniz"); String
	 * mail=girdi.next(); System.out.println("�ifre giriniz"); String
	 * sifre=girdi.next(); customerManager.singIn(mail,sifre);
	 * System.out.println("�r�nleri g�r�nt�lemek i�in 1'e bas�n�z");
	 * System.out.println("Kullan�c� i�lemleri i�in 2'ye bas�n�z"); int
	 * islem=girdi.nextInt(); if(islem==1) { customerManager.showProducts();
	 * }if(islem==2) {
	 * System.out.println("Hesap bilgilerini g�ncellemek i�in 1'e bas�n�z");
	 * System.out.println("Hesap silmek i�in 2'ye bas�n�z");
	 * 
	 * 
	 * if(girdi.nextInt()==1) { Customer customer=new Customer();
	 * System.out.println("G�ncellencek m��teri Id'sini giriniz");
	 * customer.setId(girdi.nextInt());
	 * System.out.println("G�ncellencek m��teri ismini giriniz");
	 * customer.setFirstName(girdi.next());
	 * System.out.println("G�ncellencek m��teri soyismini Id'sini giriniz");
	 * customer.setLastName(girdi.next());
	 * System.out.println("G�ncellencek m��teri Id'sini giriniz");
	 * customer.setEmail(girdi.next());
	 * System.out.println("G�ncellencek m��teri Id'sini giriniz");
	 * customer.setPassword(girdi.next()); customerManager.update(customer);
	 * 
	 * }if(girdi.nextInt()==2) {
	 * System.out.println("Emin misiniz? eminseniz 1'e bas�n�z");
	 * if(girdi.nextInt()==1) { customerManager.deleteAccount(customer2);
	 * System.out.println("h"); } }
	 * 
	 * 
	 * } } } if(a==2) {
	 * System.out.println("�irket kayd� i�in 1'e m��teri kayd� i�in 2'ye bas�n�z");
	 * int islem=girdi.nextInt(); if(islem==1) { Company company=new Company();
	 * System.out.println("�irket id'sini giriniz"); company.setId(girdi.nextInt());
	 * System.out.println("�irket �smi Giriniz");
	 * company.setCompanyName(girdi.next());
	 * System.out.println("�irket Mailinizi Giriniz");
	 * company.setEmail(girdi.next()); System.out.println("�ifre Giriniz");
	 * company.setPassword(girdi.next()); System.out.println("Kay�t olunuyor....");
	 * companyManager.signUp(company); } if(islem==2) { Customer customer=new
	 * Customer(); System.out.println("M��teri id'sini giriniz");
	 * customer.setId(girdi.nextInt()); System.out.println("�sim Giriniz");
	 * customer.setFirstName(girdi.next()); System.out.println("Soyisim Giriniz");
	 * customer.setLastName(girdi.next());
	 * System.out.println("Mail adresinizi Giriniz");
	 * customer.setEmail(girdi.next()); System.out.println("�ifre Giriniz");
	 * customer.setPassword(girdi.next()); System.out.println("Kay�t olunuyor....");
	 * customerManager.signUp(customer);
	 * 
	 * } } System.out.println();
	 */	
}
}
