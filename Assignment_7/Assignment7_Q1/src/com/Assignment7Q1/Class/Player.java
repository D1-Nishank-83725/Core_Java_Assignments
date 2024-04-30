package com.Assignment7Q1.Class;

import java.util.Scanner;

public abstract class Player {
	
	//Fields
	
	int id;
	String name;
	int age;
	int matchesPlayed;
	
	
	//Constructor
	
	

	public Player() {
	}
	
	
	public Player(int id, String name, int age, int matchesPlayed) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}

	
	
	//Getters and Setters

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getMatchesPlayed() {
		return matchesPlayed;
	}


	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	

	//toString - DISPLAY
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed
				 + "toString()=" + super.toString() + "]";
	}
	
	
	
	
	public void accept(Scanner sc) {
		System.out.println("Enter your ID: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your Name: ");
		name = sc.nextLine();
		System.out.println("Enter your Age: ");
		age = sc.nextInt();
		System.out.println("Enter your Matches Played: ");
		matchesPlayed = sc.nextInt();
	}



	
	
	
	
	
	

}
