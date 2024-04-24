import java.util.Scanner;

public class Invoice {
	
	
//	Field Initializer 
	
	
	String partNumber = "-";
	String partDescription = "-";
	int quantity = 0;
	double price = 0;
	
	
	
	
	//Object Initializer
	
	{
		
		
	}

	
	
	
	//Getters Setters
	
	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		if(quantity < 0) {
			this.quantity = 0;
		}
		else {
			this.quantity = quantity;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		if(price < 0) {
			this.price = 0;
		}
		else {
			this.price = price;
		}
	}

	
	
	//Parameterless Constructor
	
	public Invoice () {
//		System.out.println("Invoice paraless ctor called ");
//		System.out.println("Part Number      : " + partNumber);
//		System.out.println("Part Description : " + partDescription);
//		System.out.println("Quantity         : " + quantity);
//		System.out.println("Price            : " + price);
	}
	
	void accept() {
		
		Scanner sc = new Scanner(System.in);
		
//		i1.calcInvoiceAmount(10, 20);
		
		System.out.println("Enter the Part Number : ");
		partNumber = sc.nextLine();
		

		System.out.println("Enter the Part Description : ");
		partDescription = sc.nextLine();
		

		System.out.println("Enter the Part Quantity : ");
		quantity = sc.nextInt();
		if(quantity < 0) {
			this.quantity = 0;
		}
		else {
			this.quantity = quantity;
		}
		

		System.out.println("Enter the Part Price : ");
		price = sc.nextInt();
		if(price < 0) {
			this.price = 0;
		}
		else {
			this.price = price;
		}
		
	}
	
	void display() {
		System.out.println("Part Number      : " + partNumber);
		System.out.println("Part Description : " + partDescription);
		System.out.println("Quantity         : " + quantity);
		System.out.println("Price            : " + price);
		

		double invoiceAmount = quantity*price;
		System.out.println("Invoice Amount   : " + invoiceAmount);
	}
	

	

}
