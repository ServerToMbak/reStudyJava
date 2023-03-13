package com.example.server.tombak.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name ="orders")
public class Order {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "totalPrice")
	int totalPriceOfOrders;
	
	int user_id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Order(int id) {
		super();
		this.id = id;
	}
	
	public Order() {
		
	}
	public int getTotalPriceOfOrders() {
		return totalPriceOfOrders;
	}
	public void setTotalPriceOfOrders(int totalPriceOfOrders) {
		this.totalPriceOfOrders = totalPriceOfOrders;
	}
	
	
	
}
