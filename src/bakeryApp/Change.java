package bakeryApp;

import java.text.NumberFormat;

public class Change extends Food {
	
	private int amount;

	public Change() {
		super();
		amount = 0;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setProduct(int amount) {
		this.amount = amount;
	}
	
	public Change(int amount, double total) {
		this.amount = amount;
		this.total = total;
	}
	
	public int totalChange() {
		return amount - (int) total;
	}
	
	public String totalChangeFormatted() {
		NumberFormat totNum = NumberFormat.getCurrencyInstance();
		String totResult = totNum.format(totalChange());
		return totResult;
	}

	
	public int getTwenties() {
		return totalChange() / 20;
	}
	
	public int getRemainder1() {
		return totalChange() - (getTwenties() * 20);
	}
	
	public int getTens() {
		return getRemainder1() / 10;
	}
	
	public int getRemainder2() {
		return getRemainder1() - (getTens() * 10);
	}
	
	public int getFives() {
		return getRemainder2() / 5;
	}
	
	public int getOnes() {
		return getRemainder2() - (getFives() * 5);
	}

}
