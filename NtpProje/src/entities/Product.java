package entities;

public class Product {
	int id;
	String productName;
	String productPrice;
	String stockAdeti;
	public Product(int id, String productName, String productPrice, String stockAdeti) {
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.stockAdeti = stockAdeti;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getStockAdeti() {
		return stockAdeti;
	}
	public void setStockAdeti(String stockAdeti) {
		this.stockAdeti = stockAdeti;
	}
	
}
