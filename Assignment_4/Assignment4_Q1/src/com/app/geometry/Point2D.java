package com.app.geometry;
import java.lang.Math;
import java.util.Scanner;


public class Point2D {
	
	// Field Initializer 
	
	Scanner sc = new Scanner(System.in);
	
	double x;
	double y;
	
	
	
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Point2D(){
		x = 0;
		y = 0;
	}
	
	public Point2D(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	
	public void setDetails() {
		System.out.println("Enter X Value : ");
		x = sc.nextDouble();
		System.out.println("Enter Y Value : ");
		y = sc.nextDouble();
		System.out.println();
		System.out.println("Point successfully made");
		System.out.println();
	}
	
	
	 public String getDetails() {
		 String coordinates =  "( "+x+" , "+y+" )";
		 return coordinates;
//		 System.out.println("( "+ x + " , " + y + " )" );
	 }
	 
	 
	 
	 
	public static boolean isEqual(Point2D p1, Point2D p2) {
			if(p1.getX() == p2.getX() && p1.getY() == p2.getY()) {
				return true;
			}
			else {
				return false;
			}
		}
		
	public static double calculateDistance(Point2D p1, Point2D p2) {
			 
				double distance = Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2)) ;
				return distance; 
		}
	 
	 
	
	 
	 
	

}
