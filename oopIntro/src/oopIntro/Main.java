package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1=new Product(1,"lenova v14",15000,"16gb ram",10);
		
		Product product2=new Product();
		product2.setId(1);
		product2.setName("lenova V 15");
		product2.setDetail("16 gb ram");
		product2.setDisCount(10);
		product2.setUnitPrice(16000);

		Product product3=new Product();
		
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName()+product.getUnitPriceAfterDiscount());
		}
		
		
		Category category1=new Category();
		category1.setId(1);;
		category1.setName("içecek");
		
		Category category2=new Category();
		category2.setId(2);;
		category2.setName("yiyecek");
		System.out.println(products.length);
		
		
		ProductManager productManager =new ProductManager();		
		productManager.addToCart(product1);
		
	}

}
