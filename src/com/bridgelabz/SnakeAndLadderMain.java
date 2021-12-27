package com.bridgelabz;

public class SnakeAndLadderMain {
		
	public static final int NO_PLAY=1;
	public static final int LADDER=2;
	public static final int SNAKE=3;
	public static final int WIN=100;
	
	public static void main(String[] args) {
		
		int START_POSITION = 0;
        int FIRST_PLAYER_POSITION=0;
        int SECOND_PLAYER_POSITION=0;
        int DICE_PLAYED=0;
        int playerPosition=0;
        
        boolean FIRST_PLAYER_PLAYING=true;
        
		System.out.println("Starting Position is ::"+START_POSITION);

		while( FIRST_PLAYER_POSITION < WIN && SECOND_PLAYER_POSITION < WIN) 
		{
			DICE_PLAYED++;
		
			if (FIRST_PLAYER_PLAYING)
			{
				System.out.println( "Player 1 Playing  " );
				System.out.println( "Player 1 Position "+FIRST_PLAYER_POSITION );
				playerPosition = FIRST_PLAYER_POSITION;
			}
			else
			{
				System.out.println( "Player 2 Playing  " );
				System.out.println( "Player 2 Position "+SECOND_PLAYER_POSITION );
				playerPosition = SECOND_PLAYER_POSITION;
			}
			
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
	        
	        if (FIRST_PLAYER_PLAYING)
			{
				FIRST_PLAYER_POSITION = playerPosition;
				System.out.println( "First player is at :: "+FIRST_PLAYER_POSITION );
			}
			else
			{
				SECOND_PLAYER_POSITION = playerPosition;
				System.out.println( "Player 2 new Position "+SECOND_PLAYER_POSITION );
			}
	        
	        if (playerCheckOption != LADDER) 
			{
				FIRST_PLAYER_PLAYING = !(FIRST_PLAYER_PLAYING);
			}
	        
		}
		
		System.out.println("We just make "+DICE_PLAYED+" Number of dice to win the game");
	
		if (FIRST_PLAYER_POSITION == WIN) 
		{
			System.out.println("Congratulations !! First Player You Won the game");
		}
		else 
		{			
			System.out.println("Congratulations !! Second Player You Won the game");
		}
	}
}
