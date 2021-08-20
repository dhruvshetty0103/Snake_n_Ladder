import java.util.Random;

public class Snake_n_Ladder {
	
	public static Random rand=new Random();
	
	public static int randInt(int min, int max) {
	    
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public static void main(String[] args) 
	{
		//int IS_NO_PLAY = 1,IS_LADDER = 2,IS_SNAKE = 3,position=0;
		int flag1=0,flag2=0;
		int person1Position=0,person2Position=0,die_number=1,count=0; //here count is a variable to calculate the number of times the dice was rolled
		System.out.println("Welcome to Snake and Ladder game!");
		System.out.println("Both the players at postion:"+person1Position);
		
		do
		{
			do
			{
				count++;
				int option=rand.nextInt((3-1)+1)+1;//choice
				System.out.println("\nOption occurred:"+option);
				if(option==1)
					System.out.println("No play player 1 at position:"+person1Position);
				else if(option==2)
				{
					flag1=1;
					die_number=randInt(1,6);
					person1Position+=die_number;
					if((person1Position)>100)//Condition to make sure that player wins when he gets exact dice no. to reach 100
						{
							person1Position=person1Position-die_number;
							System.out.println("Ladder:But doesn't move as dice number is not exact to reach 100. as dice gave:"+die_number+" as player 1 is at postion at:"+person1Position);
						}
					else
						System.out.println("Ladder:Player 1 moves to position number:"+person1Position+"--as dice number"+die_number);
				}
				else
				{
					die_number=randInt(1,6);
					if((person1Position-die_number)<0)//condition to check when the dice asks to move back below position 0 
							person1Position=0;
					else
						person1Position-=die_number;
					System.out.println("Snake:Player 1 moves to position number:"+person1Position+"--as dice number"+die_number);
					flag1=0;
				}
			}while(flag1!=0 && person1Position!=100 && flag2==0);//Setting flag1 to 0 so that player 2 can get chance
			
			
			//person2
			do
			{
				count++;
				int option=rand.nextInt((3-1)+1)+1;//choice
				System.out.println("\nOption occurred:"+option);
				if(option==1)
					System.out.println("No play player 2 at position:"+person2Position);
				else if(option==2)
				{
					flag2=1;
					die_number=randInt(1,6);
					person2Position+=die_number;
					if((person2Position)>100)//Condition to make sure that player wins when he gets exact dice no. to reach 100
						{
							person2Position=person2Position-die_number;
							System.out.println("Ladder:But doesn't move as dice number is not exact to reach 100. as dice gave:"+die_number+" as player 2 is at postion at:"+person2Position);
						}
					else
						System.out.println("Ladder:Player 2 moves to position number:"+person2Position+"--as dice number"+die_number);
				}
				else
				{
					die_number=randInt(1,6);
					if((person2Position-die_number)<0)//condition to check when the dice asks to move back below position 0 
							person2Position=0;
					else
						person2Position-=die_number;
					System.out.println("Snake:Player 2 moves to position number:"+person2Position+"--as dice number"+die_number);
					flag2=0;
				}
			}while(flag2!=0 && person2Position!=100 && flag1==0);//Setting flag 2 to 0 so that player 1 can get chance
			
			
		}while(person1Position<100 && person2Position<100);
		if(person1Position==100)
			System.out.println("Player 1 won as he reached postion:"+person1Position+" while the player 2 was at postion:"+person2Position);
		else
			System.out.println("Player 2 won as he reached postion:"+person2Position+" while the player 1 was at postion:"+person1Position);
		System.out.println("The dice was rolled:"+count+" times.");//Displaying the number of times dice rolled.
	}

}
