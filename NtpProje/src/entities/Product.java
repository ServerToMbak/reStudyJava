package entities;

public class Product {
	int id;
	int sirket›d;
	String productName;
	int productPrice;
	int stockAdeti;
	public Product(){
		
	}
	public Product(int id,String productName, int productPrice, int stockAdeti,int sirket›d) {
		this();
		this.id = id;
		this.sirket›d=sirket›d;
		this.productName = productName;
		this.productPrice = productPrice;
		this.stockAdeti = stockAdeti;
	}
	public int getSirket›d() {
		return sirket›d;
	}
	public void setSirket›d(int sirket›d) {
		this.sirket›d = sirket›d;
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
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getStockAdeti() {
		return stockAdeti;
	}
	public void setStockAdeti(int stockAdeti) {
		this.stockAdeti = stockAdeti;
	}
	
}
