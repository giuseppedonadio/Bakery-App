package bakeryApp;

import java.text.NumberFormat;

public class Food {

	private String product;
	private double price;
	private int quantity;
	protected double total;	
	
	public Food() {
		product = "";
		price = 0;
		quantity = 0;
		total = 0;
	}
	
	public String getProduct() {
		return product;
	}
	
	public void setProduct(String product) {
		this.product = product;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Food(String product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public double getTotalItem() {		
		return price * quantity;
	}
	
	public String priceFormatted() {
		NumberFormat totNum = NumberFormat.getCurrencyInstance();
		String totResult = totNum.format(price);
		return totResult;
	}
	
	public String totalItemFormatted() {
		NumberFormat totNum = NumberFormat.getCurrencyInstance();
		String totResult = totNum.format(getTotalItem());
		return totResult;
	}
	
	public Food(double total) {
		this.price = total;	
	}
	
	public String totalFormatted() {
		NumberFormat totNum = NumberFormat.getCurrencyInstance();
		String totResult = totNum.format(total);
		return totResult;
	}
	
}
