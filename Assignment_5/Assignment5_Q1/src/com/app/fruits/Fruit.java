package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	
	
	//Fields 
	
	private String color;
	private double weight;
	private String name;
	private boolean isFresh = true;
	
	
	
	//Getters and Setters
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	
	
	
	//Constructor
	
	public Fruit() {
		
	}
	
	public Fruit(String color, double weight, String name) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
	}
	
	
//	ToString Method 
	
	public String toString() {
		return "Name: " + name + ", Color: " + color + ", Weight: " + weight;
	}
	

//	Taste Method 
	
	public String taste() {
		return "no specific taste";
	}
	
	public void accept(Scanner sc) {
		sc.nextLine();
		System.out.println("Enter Name of Fruit: ");
		name = sc.nextLine();
		System.out.println("Enter Color of Fruit: ");
		color = sc.nextLine();
		System.out.println("Enter Weight of Fruit: ");
		weight = sc.nextDouble();
	}

	
	public void display() {
		System.out.println("Name of Fruit: "+name);
		System.out.println("Color of Fruit: "+color);
		System.out.println("Weight of Fruit: "+weight);
		System.out.println("Enter if Fruit is Stale or not: "+isFresh);
		
	}
	

}
