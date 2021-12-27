package com.bridgelabz;

public class SnakeAndLadderMain {

	public static void main(String[] args) {

		int START_POSITION = 0;
		final int NO_PLAY=1;
        final int LADDER=2;
        final int SNAKE=3;
        final int WIN=100;
        int playerPosition=0;
        int DICE_PLAYED=0;
        
		System.out.println("Starting Position is ::"+START_POSITION);

		while( playerPosition < WIN) 
		{
			DICE_PLAYED++;
		
			int ROLL_DICE = (int) (Math.floor(Math.random() * 10 ) % 6) + 1 ;
			System.out.println("After Rolling Dice We Get ::"+ROLL_DICE);
			
			int playerCheckOption;
			
			playerCheckOption = (int)(Math.random()*3 )+1;
			
	        switch(playerCheckOption)
	        {
	            case NO_PLAY:
	            	
	            	System.out.println("It's No Play, Your position is not changed, You are at :"+playerPosition);                
	            	break;
	         
	            case LADDER:
	            	
	            	if((playerPosition + ROLL_DICE) <= WIN)
	            	{
		            	playerPosition = playerPosition + ROLL_DICE;
		                System.out.println("Congratulations !! You Got the ladder your position will be increesed by "+ROLL_DICE);
	            	}
	                break;
	            
	            case SNAKE:
	            	
	            	if((playerPosition - ROLL_DICE) <= START_POSITION)
	            	{
		            	playerPosition = START_POSITION;
	            	}
	            	else
	            	{
	            		playerPosition = playerPosition - ROLL_DICE;
		            	System.out.println("Oops !! You just got bitten by snake your position will be increesed by "+ROLL_DICE);
	            	}
	            	break;
	            
	            default:
	                System.out.println("Something went wrong!!");
	
	        }
	        System.out.println("Position :: "+playerPosition);
		}
		System.out.println("We just make "+DICE_PLAYED+" Number of dice to win the game");
	}
}
