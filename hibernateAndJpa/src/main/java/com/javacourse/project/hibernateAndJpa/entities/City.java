package com.javacourse.project.hibernateAndJpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;	
@Entity
@Table(name="city")
public class City {
	
	@Id
	private int id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Countrycode")
	private String countryCode;
	
	@Column(name="District")
	private String district;
	
	@Column(name="Population")
	private int population;
	
	
	public City() {}	
	public City(int id, String name, String countryCode, String district, int population) {
	
		this();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
}
