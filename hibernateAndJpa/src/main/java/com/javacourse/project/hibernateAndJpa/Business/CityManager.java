package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.DataAccess.ICityDal;
import com.javacourse.project.hibernateAndJpa.entities.City;

	
@Service
public class CityManager implements ICityService{

	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		 	
		this.cityDal = cityDal;	
	}

	@Override
	@Transactional
	public List<City> GetAll() {
		// TODO Auto-generated method stub
		return this.cityDal.GetAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		this.cityDal.add(city);
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityDal.update(city);
		
	}

	@Override
	public City getById(int id) {
		
		return this.cityDal.getById(id);
	}

	@Override
	public void delete(City city) {
		this.cityDal.delete(city);
		
	}

}
