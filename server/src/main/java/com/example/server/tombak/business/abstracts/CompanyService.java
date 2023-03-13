package com.example.server.tombak.business.abstracts;

import java.util.List;

import com.example.server.tombak.entities.Company;

public interface CompanyService {
	
	void addCompany(Company company);
	void delete(Company company);
	void update(Company compn);
	Company get(int id); 
	List<Company> getAll();
	
	
}
