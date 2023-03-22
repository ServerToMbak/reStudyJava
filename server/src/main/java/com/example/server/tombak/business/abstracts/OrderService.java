package com.example.server.tombak.business.abstracts;

import java.util.List;

import com.example.server.tombak.entities.Order;

public interface OrderService {
	public void add(Order order);
	public void delete(Order order);
	public Order update(int id,Order order);
	public Order get(int id);
	public List<Order> getAll();
	
}
