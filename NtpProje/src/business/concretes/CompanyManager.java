package business.concretes;

import business.abstracts.UserManagerService;
import dataAccess.concretes.MysqlDaOForCompany;
import entities.Company;

public class CompanyManager<T> implements UserManagerService<Company> {
	private MysqlDaOForCompany<Company> userDao;
	
	public CompanyManager(MysqlDaOForCompany userDao) {
		this.userDao=userDao;
	}

	@Override
	public void signUp(Company company) {
		this.userDao.add(company);
		System.out.println("company eklendi");
	}

	@Override
	public void singIn(Company company) {
	
		
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
