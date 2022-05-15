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
		super();
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
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

}
