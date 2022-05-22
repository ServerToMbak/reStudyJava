package com.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();		
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			//from City c ORDER BY c.name DESC
			//HQL --> hibernate query language
			//from City c where c.CountryCode='TUR' AND c.district='Ankara' //sql sorgusu
			//from City c where c.name like '%kar%'
			//from City c ORDER BY c.name DESC
		
			//-----select iþlemi------
			/*
			 * List<String> countryCodes = session.
			 * createQuery("SELECT c.CountryCode from City c GROUP BY c.CountryCode ").
			 * getResultList();
			 * 
			 * for(String countryCode:countryCodes) { System.out.println(countryCode); }
			 */
		
			//------Ýnsert iþlemi----------
			
			/*
			 * City city= new City(); city.setName("düzce 10"); city.setCountryCode("TUR");
			 * city.setDistrict("Karadeniz"); city.setPopulation(100000);
			 * 
			 * session.save(city); session.getTransaction().commit();
			 * System.out.println("ÞEHÝR EKLENDÝ ");
			 */
			
			//-----UPDATE ÝÞLEMÝ----------
			/*
			 * City city =session.get(City.class,4090); city.setPopulation(110000);
			 * 
			 * session.save(city);
			 * 
			 * 
			 * session.getTransaction().commit(); System.out.println("ÞEHÝR GÜNCELLENDÝ");
			 */
			
			
			//-----DELETE ÝÞLEMÝ-----
			  
			City city= session.get(City.class, 4000);
				
			session.delete(city);
			
			
			session.getTransaction().commit();
			System.out.println("ÞEHÝR SÝLÝNDÝ");
			
		}finally {
			factory.close();
		}	
	}

}
