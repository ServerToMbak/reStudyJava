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
		if(usercheckInformation.checkEmail(company)&&usercheckInformation.checkPassword(company)) {
			this.userDao.add(company);
			System.out.println("company eklendi");	
		}else {
			
		}
		
	}

	@Override
	public void singIn(Company company) {
	if(this.userDao.find(company.getEmail(),company.getPassword())==null) {
		System.out.println("giri� bilgilerinde kullan�c� bulunamad� tekrar deneyiniz");
	}else {
		System.out.println("giri� yap�ld�");
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
	
	public void �r�nEkle(Product product) {
		this.productdao.addProduct(product);
	}
	public void �r�nSil(Product product) {
		this.productdao.DeleteProduct(product);
	}
	public void t�m�r�nlerim() {
		this.productdao.showProducts();
	}
	

}
