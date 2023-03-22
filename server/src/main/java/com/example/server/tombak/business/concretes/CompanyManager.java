package com.example.server.tombak.business.concretes;

import java.util.List;
import java.util.Optional;

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
	public Company update(int id,Company NewCompany) {
		Optional<Company> company= _companyDal.findById(id);
		
		if(company.isPresent())
		{
			Company foundCompany = company.get();
			
			foundCompany.setCompany_code(NewCompany.getCompany_code());
			foundCompany.setCompanyName(NewCompany. getCompanyName());
			_companyDal.save(foundCompany);
			 return foundCompany;
		}
		else
			return null;
		
	}
	@Override
	public Company get(int id) {
		return _companyDal.findById(id).orElse(null);
	}
	@Override
	public List<Company> getAll() {
		return _companyDal.findAll();
	}
	
}
