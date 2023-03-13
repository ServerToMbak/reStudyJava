package com.example.server.tombak.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.server.tombak.business.abstracts.CompanyService;
import com.example.server.tombak.dataAccess.abstratcs.CompanyDal;
import com.example.server.tombak.entities.Company;


@Service
public class CompanyManager implements CompanyService{
	
	private CompanyDal _companyDal;
	
	
	
	@Autowired
	public CompanyManager(CompanyDal companyDal)
	{
		_companyDal = companyDal;
	}
	@Override
	public void addCompany(Company company) {
		_companyDal.save(company);
		
	}

	@Override
	public void delete(Company company) {
		_companyDal.delete(company);
		
	}

	@Override
	public void update(Company company) {
		_companyDal.save(company);
		
	}
	@Override
	public Company get(int id) {
		return null;
	}
	@Override
	public List<Company> getAll() {
		return _companyDal.findAll();
	}
	
}
