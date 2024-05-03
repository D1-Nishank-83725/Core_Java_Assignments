import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		
		Product[] products = {
		           new Product(1, "Laptop", "Electronics", 1200),
		           new Product(2, "Shirt", "Clothing", 25),
		           new Product(3, "Headphones", "Electronics", 100),
		           new Product(4, "Jeans", "Clothing", 50),
		           new Product(5, "Smartphone", "Electronics", 800),
		           new Product(6, "T-shirt", "Clothing", 15),
		           new Product(7, "Watch", "Accessories", 150),
		           new Product(8, "Sneakers", "Footwear", 80),
		           new Product(9, "Bag", "Accessories", 50),
		           new Product(10, "Desk Lamp", "Home Decor", 30)
		};
		

		System.out.println("Before Sorting: ");
		
		for(Product p: products) {
//			System.out.println(e);
			System.out.println(p.toString());
			
		}
		
		
		Arrays.sort(products);
		

		System.out.println("Before Sorting: ");
		
		for(Product p: products) {
//			System.out.println(e);
			System.out.println(p.toString());
			
		}
		
		
		

	}

}
