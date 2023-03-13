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
	company2.setCompanyName("ikinci þirket");
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
		System.out.println("giriþ baþarýlý...");
		System.out.println("Yapmak istediðiniz iþlemi seçiniz.\n1.Ürün ekle"
				+ "\n2.Ürün bilgilerini güncelle"
				+"\n3.Ürün Sil"
				+ "\n4.Hesap Ýþlemleri");
		int a=girdi.nextInt();
		if(a==1) {
			
			companyManager.ürünEkle(company1, product);
		}if(a==2) {
			
		}if(a==3) {
			
		}
	}if(giris==false) {
		System.out.println("Çýkýþ Yapýlmýþtýr...");
		
		System.exit(0);
	}
	
	/*
	 * Scanner girdi=new Scanner(System.in);
	 * 
	 * 
	 * System.out.
	 * println("Eðer hesabýnýz varsa giriþ yapmak için 1'e basýnýz yoksa kayýt oluþturmak için 2'ye basýnýz"
	 * );
	 * 
	 * int a=girdi.nextInt();
	 * 
	 * if(a==1) {
	 * System.out.println("þirket giriþi için 1'e müþteri giriþi için 2'ye basýnýz"
	 * ); int sonuc=girdi.nextInt();
	 * 
	 * 
	 * if(sonuc==1) { System.out.println("mail adresinizi giriniz"); String
	 * mail=girdi.next(); System.out.println("þifre giriniz"); String
	 * sifre=girdi.next(); companyManager.singIn();
	 * System.out.println("Ürün eklemek için 1");
	 * System.out.println("Ürün silmek için 2");
	 * System.out.println("Ürün güncellemek için 3'e basýnýz");
	 * System.out.println("Tüm Ürünleri görüntülemek için 4'e basýnýz");
	 * 
	 * int secim=girdi.nextInt(); if(secim==1) { Product product=new Product();
	 * System.out.println("Eklenecek Ürünün Id'sini yazýnýz");
	 * product.setId(girdi.nextInt());
	 * System.out.println("Eklenecek Ürünün ismini giriniz");
	 * product.setProductName(girdi.next());
	 * System.out.println("Eklenecek Ürünün Fiyatýný giriniz");
	 * product.setProductPrice(girdi.nextInt());
	 * System.out.println("Eklenecek Ürünün stok adetini giriniz");
	 * product.setStockAdeti(girdi.nextInt()); companyManager.ürünEkle(product);
	 * 
	 * }if(secim==2) { Product product=new Product();
	 * System.out.println("sileceðiniz ürünün Id'sini giriniz");
	 * product.setId(girdi.nextInt()); companyManager.ürünSil(product);
	 * 
	 * 
	 * }if(secim==3) { Product product1=new Product();
	 * System.out.println("Güncellenecek Ürünün Id'sini yazýnýz");
	 * product1.setId(girdi.nextInt());
	 * System.out.println("Güncellenecek Ürünün ismini giriniz");
	 * product1.setProductName(girdi.next());
	 * System.out.println("Güncellenecek Ürünün Fiyatýný giriniz");
	 * product1.setProductPrice(girdi.nextInt());
	 * System.out.println("Güncellenecek Ürünün stok adetini giriniz");
	 * product1.setStockAdeti(girdi.nextInt());
	 * companyManager.ürünGüncelle(product1);
	 * 
	 * }if(secim==4) { companyManager.tümÜrünlerim(); }
	 * 
	 * } if(sonuc==2) { System.out.println("mail adresinizi giriniz"); String
	 * mail=girdi.next(); System.out.println("þifre giriniz"); String
	 * sifre=girdi.next(); customerManager.singIn(mail,sifre);
	 * System.out.println("Ürünleri görüntülemek için 1'e basýnýz");
	 * System.out.println("Kullanýcý iþlemleri için 2'ye basýnýz"); int
	 * islem=girdi.nextInt(); if(islem==1) { customerManager.showProducts();
	 * }if(islem==2) {
	 * System.out.println("Hesap bilgilerini güncellemek için 1'e basýnýz");
	 * System.out.println("Hesap silmek için 2'ye basýnýz");
	 * 
	 * 
	 * if(girdi.nextInt()==1) { Customer customer=new Customer();
	 * System.out.println("Güncellencek müþteri Id'sini giriniz");
	 * customer.setId(girdi.nextInt());
	 * System.out.println("Güncellencek müþteri ismini giriniz");
	 * customer.setFirstName(girdi.next());
	 * System.out.println("Güncellencek müþteri soyismini Id'sini giriniz");
	 * customer.setLastName(girdi.next());
	 * System.out.println("Güncellencek müþteri Id'sini giriniz");
	 * customer.setEmail(girdi.next());
	 * System.out.println("Güncellencek müþteri Id'sini giriniz");
	 * customer.setPassword(girdi.next()); customerManager.update(customer);
	 * 
	 * }if(girdi.nextInt()==2) {
	 * System.out.println("Emin misiniz? eminseniz 1'e basýnýz");
	 * if(girdi.nextInt()==1) { customerManager.deleteAccount(customer2);
	 * System.out.println("h"); } }
	 * 
	 * 
	 * } } } if(a==2) {
	 * System.out.println("þirket kaydý için 1'e müþteri kaydý için 2'ye basýnýz");
	 * int islem=girdi.nextInt(); if(islem==1) { Company company=new Company();
	 * System.out.println("Þirket id'sini giriniz"); company.setId(girdi.nextInt());
	 * System.out.println("Þirket Ýsmi Giriniz");
	 * company.setCompanyName(girdi.next());
	 * System.out.println("þirket Mailinizi Giriniz");
	 * company.setEmail(girdi.next()); System.out.println("Þifre Giriniz");
	 * company.setPassword(girdi.next()); System.out.println("Kayýt olunuyor....");
	 * companyManager.signUp(company); } if(islem==2) { Customer customer=new
	 * Customer(); System.out.println("Müþteri id'sini giriniz");
	 * customer.setId(girdi.nextInt()); System.out.println("Ýsim Giriniz");
	 * customer.setFirstName(girdi.next()); System.out.println("Soyisim Giriniz");
	 * customer.setLastName(girdi.next());
	 * System.out.println("Mail adresinizi Giriniz");
	 * customer.setEmail(girdi.next()); System.out.println("Þifre Giriniz");
	 * customer.setPassword(girdi.next()); System.out.println("Kayýt olunuyor....");
	 * customerManager.signUp(customer);
	 * 
	 * } } System.out.println();
	 */	
}
}
