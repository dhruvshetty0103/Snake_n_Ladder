import java.util.Random;

public class Snake_n_Ladder {
	
	public static int randInt(int min, int max) {
	    Random rand=new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public static void main(String[] args) 
	{
		//int IS_NO_PLAY = 1,IS_LADDER = 2,IS_SNAKE = 3,position=0;
		int personPosition=0,die_number=1;
		System.out.println("Welcome to Snake and Ladder game!");
		System.out.println("Player postion at:"+personPosition);
		die_number=randInt(1,6);
		System.out.println("Dice value:"+die_number);
	}

}
