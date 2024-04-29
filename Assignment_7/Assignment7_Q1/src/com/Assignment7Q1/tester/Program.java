package com.Assignment7Q1.tester;

import java.util.Scanner;

import com.Assignment7Q1.Class.Cricketer;
import com.Assignment7Q1.Class.Player;

public class Program {
	
	
	
	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Accept Batter");
		System.out.println("2. Accept Bowler");
		System.out.println("3. Show total Number of Runs made");
		System.out.println("4. Show total Number of Wickets taken");
		System.out.println("5. Show All Cricketers Name with Number of matches played individually");
		System.out.print("Enter the choice - ");
		return sc.nextInt();
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		int counter = 0;
		Player[] team = new Player[11];
		
		
		
		while((choice = menu(sc)) != 0) {
			switch(choice) {

			case 1:
				if(counter < 11) {					
					team[counter] = new Cricketer();
					team[counter].accept(sc);
					counter++;
				}
				else {
					System.out.println("Team Full!");
				}
				break;
				
			case 2:
				if (counter < 11) {					
					team[counter] = new Cricketer();
					team[counter].accept(sc);
					counter++;
				}
				else {
					System.out.println("Team Full!");
				}
				break;
				
	
			case 3:
				int totalRuns = 0;
				for(Player p : team) {
					if(p != null) {						
						totalRuns += p.getRuns();
					}				
				}
				System.out.println("Total Runs Made: " + totalRuns);
				break;
				

			case 4:
				int totalWickets = 0;
				for(Player p : team) {
					if(p != null) {						
						totalWickets += p.getWickets();
					}				
				}
				System.out.println("Total Wickets Taken: " + totalWickets);
				break;
				

			case 5:
				for(Player p : team) {
					if(p != null) {						
						System.out.println("Player Name: " + p.getName());
						System.out.println("Number of Matches Played : " + p.getMatchesPlayed());
					}				
				}
				break;
				
			default:
				System.out.println("Invalid Choice");
				
			}
		}
		
		
		
	}
	

}
