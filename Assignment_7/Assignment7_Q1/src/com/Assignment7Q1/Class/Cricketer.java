package com.Assignment7Q1.Class;

import java.util.Scanner;

import com.Assignment7Q1.Interface.Batter;
import com.Assignment7Q1.Interface.Bowler;

public class Cricketer extends Player implements Batter, Bowler{
	

	@Override
	public int getRuns(Scanner sc) {
		return getRuns();
	}

	@Override
	public int getWickets(Scanner sc) {
		return getWickets();
	}


	

	

}
