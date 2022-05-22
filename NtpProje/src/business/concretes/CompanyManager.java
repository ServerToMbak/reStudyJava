package business.concretes;

import business.abstracts.UserManagerService;
import dataAccess.abstracts.ProductDao;
import dataAccess.concretes.MysqlDaOForCompanyUser;
import entities.Company;
import entities.Product;

public class CompanyManager<T> implements UserManagerService<Company> {
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
		this.userDao.add(company);
		System.out.println("company eklendi");
	}

	@Override
	public void singIn(Company company) {
	 if((usercheckInformation.checkPassword(company)&&usercheckInformation.checkPassword(company))==true) {
		 	System.out.println("giriþ yaptýnýz");
	 }
		
	}

	@Override
	public void Update(Company company) {
		this.userDao.update(company);
		
	}

	@Override
	public void deleteAccount(Company customer) {
		this.userDao.delete(customer);
		
	}
	
	public void ürünEkle(Product product) {
		this.productdao.addProduct(product);
	}
	public void ürünSil(Product product) {
		this.productdao.DeleteProduct(product);
	}
	public void tümÜrünlerim() {
		this.productdao.showProducts();
	}
	

}
