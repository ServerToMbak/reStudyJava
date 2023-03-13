package com.example.server.tombak.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity //-->it shows that this class will be mapped to a database table
@Table(name="products") // databaser table name
@Data // Lombok<
public class Product {
	
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitprice;
	
	@Column(name="unitsInStock")
	private int unitsInStock;
	
	@Column(name = "companyId")
	private int companyId;
	
	public Product()
	{
		
	}
	
	public Product(int id, String productName, double unitprice, int unitsInStock, int companyId) {
		super();
		this.id = id;
		this.productName = productName;
		this.unitprice = unitprice;
		this.unitsInStock = unitsInStock;
		this.companyId = companyId;
	}

	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

}