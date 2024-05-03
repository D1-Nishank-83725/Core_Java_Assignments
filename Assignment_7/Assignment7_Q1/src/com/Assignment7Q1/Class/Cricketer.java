package com.Assignment7Q1.Class;

import java.util.Scanner;

import com.Assignment7Q1.Interface.Batter;
import com.Assignment7Q1.Interface.Bowler;

public class Cricketer extends Player implements Batter, Bowler{

	int runs;
	int wickets;
	
	

	public void setRuns(int runs) {
		this.runs = runs;
	}


	public void setWickets(int wickets) {
		this.wickets = wickets;
	}


	@Override
	public int getWickets() {
		return wickets;
	}


	@Override
	public int getRuns() {
		return runs;
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter the number of Runs you made: ");	
		runs = sc.nextInt();
		System.out.println("Enter the number of Wickets you took: ");		
		wickets = sc.nextInt();
	}



	

	

}
