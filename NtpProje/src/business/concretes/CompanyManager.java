package business.concretes;

import java.util.ArrayList;

import business.abstracts.UserManagerService;
import entities.Company;

public class CompanyManager<T> implements UserManagerService<Company> {
	
	
	
	ArrayList<Company> companyList = new ArrayList<Company>();
	@Override
	public void signUp(Company company) {
		companyList.add(company);
		
	}

	@Override
	public void singIn(Company company) {
	
		
	}

}
