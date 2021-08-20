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
		int personPosition=0,die_number=1,count=0; //here count is a variable to calculate the number of times the dice was rolled
		System.out.println("Welcome to Snake and Ladder game!");
		System.out.println("Player postion at:"+personPosition);
		
		do
		{
			count++;
			int option=rand.nextInt((3-1)+1)+1;//choice
			System.out.println("\nOption occurred:"+option);
			if(option==1)
				System.out.println("No play player at position:"+personPosition);
			else if(option==2)
			{	
				die_number=randInt(1,6);
				personPosition+=die_number;
				if((personPosition)>100)//Condition to make sure that player wins when he gets exact dice no. to reach 100
					{
						personPosition=personPosition-die_number;
						System.out.println("Ladder:But doesn't move as dice number is not exact to reach 100. as dice gave:"+die_number+" as player is at postion at:"+personPosition);
					}
				else
					System.out.println("Ladder:Player moves to position number:"+personPosition+"--as dice number"+die_number);
			}
			else
			{
				die_number=randInt(1,6);
				if((personPosition-die_number)<0)//condition to check when the dice asks to move back below position 0 
					personPosition=0;
				else
					personPosition-=die_number;
				System.out.println("Snake:Player moves to position number:"+personPosition+"--as dice number"+die_number);
			}
		}while(personPosition<100);
		
		System.out.println("The dice was rolled:"+count+" times.");//Displaying the number of times dice rolled.
	}

}
