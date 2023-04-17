package com.example.server.tombak.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.server.tombak.business.abstracts.OrderService;
import com.example.server.tombak.core.utilities.DataResult;
import com.example.server.tombak.core.utilities.Result;
import com.example.server.tombak.core.utilities.SuccessDataResult;
import com.example.server.tombak.core.utilities.SuccessResult;
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
	public Result add(Order order) {
		_orderDal.save(order);
		return new SuccessResult("The operation is succesfull");
		
	}

	@Override
	public void delete(Order order) {
		_orderDal.delete(order);
		
	}

	@Override
	public Order update(int id, Order NewOrder) {
		
		Optional<Order> order = _orderDal.findById(id);
	
		if(order.isPresent()) 
		{
			Order foundOrder = order.get();
			foundOrder.setTotalPriceOfOrders(NewOrder.getTotalPriceOfOrders());
			 _orderDal.save(foundOrder);
			 return foundOrder;
			
		} else
			return null;
		
			
		
		
	}

	@Override
	public DataResult<Order> get(int id) {
		return new SuccessDataResult<Order>
			(_orderDal.findById(id).orElse(null),"The operation is successfull");
		
	}

	@Override
	public List<Order> getAll() {
		return _orderDal.findAll();
		
	}

}
