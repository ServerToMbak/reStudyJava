package com.example.server.tombak.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.server.tombak.business.abstracts.OrderService;
import com.example.server.tombak.dataAccess.abstratcs.OrderDal;
import com.example.server.tombak.entities.Order;

@Service
public class OrderManager implements OrderService{

	private OrderDal _orderDal;
	
	
	@Autowired
	public OrderManager(OrderDal orderdal)
	{
		_orderDal = orderdal;
	}
	
	@Override
	public void add(Order order) {
		_orderDal.save(order);
		
	}

	@Override
	public void delete(Order order) {
		_orderDal.delete(order);
		
	}

	@Override
	public void update(Order order) {
		_orderDal.save(order);
		
	}

	@Override
	public Order get(int id) {
		return null;
		
	}

	@Override
	public List<Order> getAll() {
		return _orderDal.findAll();
		
	}

}
