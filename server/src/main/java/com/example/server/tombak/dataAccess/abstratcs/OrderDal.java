package com.example.server.tombak.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.server.tombak.entities.Order;


public interface OrderDal extends JpaRepository<Order,Integer>{

}
