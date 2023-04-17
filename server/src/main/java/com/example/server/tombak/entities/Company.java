package com.example.server.tombak.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Table(name ="companies")
@Data
@Entity
public class Company  {
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name="company_name")
	private String companyName;	
	
	@Column(name="company_code")
	private int company_code;
	
	
	
	public Company(int id, String companyName, int company_code) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.company_code = company_code;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getCompany_code() {
		return company_code;
	}

	public void setCompany_code(int company_code) {
		this.company_code = company_code;
	}

	
}
