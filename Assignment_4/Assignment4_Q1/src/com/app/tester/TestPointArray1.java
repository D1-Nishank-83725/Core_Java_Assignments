package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;
 
public class TestPointArray1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Points you want: ");
		int noOfPoints = sc.nextInt();
		
		Point2D [] points = new Point2D[noOfPoints];
		
		for (int i = 0; i < noOfPoints; i++) {
			points[i] = new Point2D();
			points[i].setDetails();
		}
		
		
		while(true) {
			
			System.out.println("Enter your Choice");
			System.out.println();
			System.out.println("1. Display Details of a specific Point              : ");
			System.out.println("2. Display X, Y Co-ordinates of all Points          : ");
			System.out.println("3. Enter two indices, if valid you'll see Distance  : ");
			System.out.println("4: Exit                                             : ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				
			case 1:
				System.out.println("Enter the Index: ");
				int index = sc.nextInt();
				String coordinates = points[index].getDetails();
				System.out.println(coordinates);
				
				break;
				
			case 2:
				
				for(Point2D point : points) {
					String coordinates1 = point.getDetails();
					System.out.println(coordinates1);
					
				}
				
				break;

			case 3:
				System.out.println("Enter Index 1: ");
				int index1 = sc.nextInt();
				System.out.println("Enter Index 2: ");
				int index2 = sc.nextInt();
				
				if(index1 >= 0 && index1 < noOfPoints && index2 >= 0 && index2 < noOfPoints) 
				{
					if(points[index1].getX() == points[index2].getX() && points[index1].getY() == points[index2].getY())
					{
						System.out.println("Sorry both indexes are showing the same point, therefore distance between 0");
					}
					else 
					{
						double distance = Point2D.calculateDistance(points[index1], points[index2]);
						System.out.println("Distance between the Two Points: "+ distance);
					}
				}
				else {
					System.out.println("Entered Invalid Indexes! Try Again!");
				}
	
				break;

			case 4:
				System.exit(0);
				break;
				
				
			
			}
			
			
			
			
		}

	}

}
