package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.Company;
public class MysqlDaOForCompany<T> implements UserDao<Company>{
	
	ArrayList<Company> companyList=new ArrayList<Company>();
	
	
	
	@Override
	public void add(Company company) {
		companyList.add(company);
		System.out.println(company.getCompanyName());
	
		
	}

	@Override
	public void delete(Company company) {
		companyList.remove(company); 
		System.out.println(company.getEmail()+"--> mail adresli þirket silindi");
	}

	@Override
	public void update(Company company) {
		System.out.println("güncellendi");
		company.setEmail(company.getEmail());
		company.setCompanyName(company.getCompanyName());
		company.setPassword(company.getPassword());
		companyList.set(companyList.indexOf(company),company);
		System.out.println("güncellendi güncel þirket bilgileri: " + company.getEmail()+" "
		+company.getCompanyName()+ " " + company.getPassword());
		
	}

	@Override
	public void list(Company company) {
		
	}

	@Override
	public String mail(Company company) {
		
		return company.getEmail();
	
	}

	@Override
	public String password(Company company) {
		// TODO Auto-generated method stub
		return company.getPassword();
	}

	
	}
	

