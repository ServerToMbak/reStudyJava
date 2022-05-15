package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import com.javacourse.project.hibernateAndJpa.entities.City;

public interface ICityService {
	List<City> GetAll();
	void add(City city);
	void update(City city);
	
}
