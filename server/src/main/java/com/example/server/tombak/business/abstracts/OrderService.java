package com.example.server.tombak.business.abstracts;

import java.util.List;

import com.example.server.tombak.core.utilities.DataResult;
import com.example.server.tombak.core.utilities.Result;
import com.example.server.tombak.entities.Order;

public interface OrderService {
	public Result add(Order order);
	public void delete(Order order);
	public Order update(int id,Order order);
	public DataResult<Order> get(int id);
	public List<Order> getAll();
	
}
