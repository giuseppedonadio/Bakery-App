package bakeryApp;

public class Menu {
	
	public static Food getFood(String product, int quantity) {
		
		Food food = new Food(product, quantity);
		
		food.setProduct(product);
		food.setQuantity(quantity);
		
		if(product.equalsIgnoreCase("Pie")) {
			food.setProduct("Pie");
			food.setPrice(2.00);
			
		}else if(product.equalsIgnoreCase("Cake")) {
			food.setProduct("Cake");
			food.setPrice(3.00);
			
		}else if(product.equalsIgnoreCase("Cookies")) {
			food.setProduct("Cookies");
			food.setPrice(1.00);
			
		}else{
			food.setPrice(00.00);
			food.setProduct("Unknown");
		}
		
		return food;
	}

}
