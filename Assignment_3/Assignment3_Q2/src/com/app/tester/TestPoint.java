package com.app.tester;

import com.app.geometry.Point2D;




public class TestPoint {
	
	
		
	

	public static void main(String[] args) {
		
		

//		Scanner sc = new Scanner(System.in);
		//Initialized using Parameterized Constructor
		Point2D p1 = new Point2D(2,2);
//		p1.getDetails();
		Point2D p2 = new Point2D(5,6);
//		p2.getDetails();
		
		p1.setDetails();
		p1.getDetails();
		p2.setDetails();
		p2.getDetails();
		
		System.out.println();
		System.out.println("Point 1 : ");
		p1.getDetails();
		System.out.println("Point 2 : ");
		p2.getDetails();
		
		
		
		boolean isEqual = Point2D.isEqual(p1, p2);
		if(isEqual == true) {			
			System.out.println("Point equal, therefore distance will be 0");
			
		}
		else {
			System.out.println("Point is not Equal");

			double distance = Point2D.calculateDistance(p1, p2);
			System.out.println("Therefore, Distance between the two entered points: " + distance);
			System.out.println();
		}
		
				
	

	}

}
