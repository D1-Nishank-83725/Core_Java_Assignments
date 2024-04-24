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
	
	
	 public void getDetails() {
		 System.out.println("( "+ x + " , " + y + " )" );
	 }
	 
	 
	
	 
	 
	

}
