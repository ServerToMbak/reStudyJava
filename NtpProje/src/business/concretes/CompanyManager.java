package business.concretes;

import business.abstracts.UserManagerService;
import dataAccess.concretes.MysqlDaOForCompany;
import entities.Company;

public class CompanyManager<T> implements UserManagerService<Company> {
	private MysqlDaOForCompany<Company> userDao;
	private UserCheckInformation usercheckInformation;
	public CompanyManager(MysqlDaOForCompany<Company> userDao,UserCheckInformation userCheckInformation) {
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
	 if(usercheckInformation.checkPassword(company)&&usercheckInformation.checkPassword(company)) {
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

}
