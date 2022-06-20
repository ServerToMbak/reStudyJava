package business.concretes;

import java.util.Scanner;

import business.abstracts.UserManagerService;
import dataAccess.abstracts.ProductDao;
import dataAccess.concretes.MysqlDaOForCompanyUser;
import entities.Company;
import entities.Product;

public class CompanyManager<T> implements UserManagerService<Company> {
	Scanner girdi=new Scanner(System.in);
	private MysqlDaOForCompanyUser<Company> userDao;
	private UserCheckInformation usercheckInformation;
	private ProductDao productdao;
	public CompanyManager(MysqlDaOForCompanyUser<Company> userDao,ProductDao productDao,UserCheckInformation userCheckInformation) {
		this.productdao= productDao;
		this.userDao=userDao;
		this.usercheckInformation=userCheckInformation;
	}

	@Override
	public void signUp(Company company) {
		if(usercheckInformation.checkEmail(company)&&usercheckInformation.checkPassword(company)) {
			this.userDao.add(company);
			System.out.println("company eklendi");	
		}else {
			
		}
		
	}

	@Override
	public boolean singIn() {
		System.out.println("Mail adresinizi giriniz");
		String mail=girdi.next();
		System.out.println("Þifreyi Giriniz");
		String sifre=girdi.next();
		if(this.userDao.find(mail,sifre)!=null)
		{
			System.out.println("giriþ yapýldý "+this.userDao.find(mail,sifre).getCompanyName()+" Hoþgeldiniz");
			return true;
		}
		if(this.userDao.find(mail, sifre)==null)
		{
			System.out.println("giriþ bilgileri Hatalý 0'la çýkýþ yapabilir yada 1'e basarak tekrar deneyebilivrsiniz");
			int girdi2=girdi.nextInt();
			if(girdi2==0) {
				System.out.println("Çýkýþ Yapýldý");
				return false;
			}
			if(girdi2==1) {
				singIn();
			}
			return false;
		}
		
	return false;
		
	}

	@Override
	public void update(Company company) {
		this.userDao.update(company);
		
	}

	@Override
	public void deleteAccount(Company customer) {
		this.userDao.delete(customer);
		
	}
	
	public void ürünEkle(Company company,Product product) {
	product=new Product();
	System.out.println("Eklenecek Ürün Ýsmi giriniz:");
		product.setProductName(girdi.next());
	System.out.println("Ekelenecek ürün fiyatýný giriniz");	
		product.setProductPrice(girdi.nextInt());
	System.out.println("Ekelenek Üürnümn Stok adetini giriniz");
		product.setStockAdeti(girdi.nextInt());
	this.productdao.addProduct(product);
		
	}
	public void ürünSil(Product product) {
		this.productdao.deleteProduct(product);
	}
	public void ürünGüncelle(Product product) {
		this.productdao.updateProduct(product);
	}
	public void tümÜrünlerim() {
		this.productdao.showProducts();
	}
	

}
