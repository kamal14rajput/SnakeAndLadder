package com.bridgelabz;

public class SnakeAndLadderMain {

	public static void main(String[] args) {
		int START_POSITION = 0;
		System.out.println("Starting Position is:" + START_POSITION);

		int ROLL_DICE = (int) (Math.floor(Math.random() * 10 ) % 6) + 1 ;
		System.out.println("After Rolling Dice We Get:" + ROLL_DICE);
	}

}
