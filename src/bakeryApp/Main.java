package bakeryApp;

public class Main {

public static void main(String[] args) {
		
		Console.displayLine("Welcome to the bakery");
		
		String choice = "";
		choice = Console.getString("Would you like to shop? y/n\n");
		
		String product = "";
		int quantity = 0;
		String stPrice = "";
			
		while(choice.equalsIgnoreCase("y")) {
			
			Console.displayLine("\nThank you for choosing to shop.\nOur Specials Today Are:\n");
			
			String[] productCodes = {"Pie", "Cake", "Cookies"};

			for(int i =0; i < productCodes.length; i++){			
				quantity = 1;
				product = productCodes[i];

				Food food = Menu.getFood(product, quantity);
				stPrice = food.priceFormatted();
				if(product.equalsIgnoreCase("Cookies")){
					Console.displayLine(food.getProduct() + " - " + stPrice + " each");
				}else{
					Console.displayLine(food.getProduct() + " - " + stPrice + " per slice");
				}								
			}	
			
			
			product = "Pie";
			quantity = Console.getInt("\nHow many slices of Pie would you like?\n");
			Food food1 = Menu.getFood(product, quantity);
			
			product = "Cake";
			quantity = Console.getInt("\nHow many slices of Cake would you like?\n");
			Food food2 = Menu.getFood(product, quantity);
			
			product = "Cookies";
			quantity = Console.getInt("\nHow many Cookies would you like?\n");
			Food food3 = Menu.getFood(product, quantity);
			
			Console.displayLine("\nYour Order:\n"
								+ food1.getProduct() + ": " + food1.getQuantity() + " = " + food1.totalItemFormatted() + "\n"
								+ food2.getProduct() + ": " + food2.getQuantity() + " = " + food2.totalItemFormatted() + "\n"
								+ food3.getProduct() + ": " + food3.getQuantity() + " = " + food3.totalItemFormatted() + "\n");
			
			double total = food1.getTotalItem() + food2.getTotalItem() + food3.getTotalItem();
			Food food = new Food(total); 			
			Console.displayLine("Total: " + food.priceFormatted());
			
			int amount = Console.getInt("Please Enter a Whole Dollar Amount Greater Than the Order Total\n");
			Change change = new Change(amount, total);
			Console.displayLine("Total Change: " + change.totalChangeFormatted());
			
			Console.displayLine("Twenties: " + change.getTwenties() + "\n"
							  + "Tens: " + change.getTens() + "\n"
							  + "Fives: " + change.getFives() + "\n"
							  + "Ones: " + change.getOnes() + "\n");
						
			choice = Console.getString("\nContinue? y/n \n");		
		}
		Console.displayLine("Thanks for dropping by...GoodBye!");

	}

}
