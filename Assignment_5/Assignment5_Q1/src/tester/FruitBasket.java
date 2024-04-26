package tester;
import java.util.Scanner;

import com.app.fruits.Fruit;
import com.app.fruits.Apple;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of your Fruit Box : ");
		int fbsize = sc.nextInt();
		
		Fruit fb[] = new Fruit[fbsize];
		
		int counter = 0;
		
		while(true) {
			System.out.println();
			System.out.println("0. Exit: ");
			System.out.println("1. Add Mango: ");
			System.out.println("2. Add Orange: ");
			System.out.println("3. Add Apple: ");
			System.out.println("4. Display names of all fruits in the basket: ");
			System.out.println("5. Display Name, Color, Weight, Taste of all fruits in the basket: ");
			System.out.println("6. Mark a Fruit as Stale: ");
			System.out.println("7. Display tastes of all stale(not fresh) fruits: ");
			System.out.println("8. Mark all Sour foods as Stale: ");
//			System.out.println("9. Mark all sour fruits Stale: ");
			int choice = sc.nextInt();
			
			
			switch(choice) {
			
			
				case 0:
					System.out.println();
					System.out.println("Thank you for using the Program");
					System.exit(0);
					break;
				
					
					
				case 1:
					if(counter < fbsize) {		
						fb[counter] = new Mango();
						fb[counter].accept(sc);
						counter++;
					}
					else {
						System.out.println();
						System.out.println("Fruit Basket Full");
					}
					break;
					
					
					
				case 2:
					if(counter < fbsize) {
						fb[counter] = new Orange();
						fb[counter].accept(sc);
						counter++;
						
					}
					else {
						System.out.println("Fruit Basket Full");
					}
					break;
					
					
					
				case 3:
					if(counter < fbsize) {
						fb[counter] = new Apple();
						fb[counter].accept(sc);
						counter++;
						
					
					}
					else {
						System.out.println("Fruit Basket Full");
					}
				break;
					
					
					
				case 4:
					System.out.println("Name of Each Fruit: ");
					for(Fruit fruit : fb) {
						System.out.println(fruit.getName());
					}
					break;
					
					
					
				case 5:
					System.out.println("Name, Color, Weight, Taste of Each Fruit: ");
					System.out.println("------------------------------------------");
					for(Fruit fruit : fb) {
	//					System.out.println("Name: " + fruit.getName());
	//					System.out.println("Color: " + fruit.getColor());
	//					System.out.println("Weight: " + fruit.getWeight());
	//					System.out.println("Taste: " + fruit.taste());
						if(fruit != null) {	
							System.out.println(fruit.toString());
							
						}
						System.out.println("------------------------------------------");
					}
					break;
					
				case 6:
					System.out.println("Enter the index to mark the Fruit Stale: ");
					int index = sc.nextInt();
					if(index >= 0 && index < fbsize) {					
						fb[index].setFresh(false);
					}
					else {
						System.out.println("Invalid Index!");
					}
					break;
					
	
				case 7:
					for(Fruit fruit : fb) {
						if(fruit.isFresh() == false) {
							System.out.println("Name of Fruit: " + fruit.getName() + " Taste: " + fruit.taste()); 
						}
					}
					 break;
					 
					 
				case 8:
					for(Fruit fruit : fb) {
						if(fruit.taste() == "sour") {
							fruit.setFresh(false);
							System.out.println("All Sour foods marked as Stale");
							
						}
					}
					break;
					
			
			}
		}
	}
}	
