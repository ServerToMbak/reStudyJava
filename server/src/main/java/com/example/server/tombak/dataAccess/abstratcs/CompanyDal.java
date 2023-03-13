package com.example.server.tombak.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.server.tombak.entities.Company;

public interface CompanyDal extends JpaRepository<Company,Integer>{

}
