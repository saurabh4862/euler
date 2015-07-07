import java.util.Random;
import java.io.File;
import java.lang.*;
import java.io.IOException;
import java.util.Scanner;
public class Chase{
	
	public static void main(String[] args)
	{
		Double total=0.0; 
		Random rand = new Random();
		long time1 = System.currentTimeMillis();
		for (int i=0;i<1000000;i++)
		{
			ChasePlayer player1= new ChasePlayer(1);
			ChasePlayer player2= new ChasePlayer(51);
			int count=0;
			while(player1.pos!=player2.pos)
			{
				int r1 = rand.nextInt(6)+1;
				player1.position(r1);
				int r2 = rand.nextInt(6)+1;
				player2.position(r2);
				count=count+1;
			//System.out.println(player1.pos+" "+player2.pos);
			}
			total=total+count;
		}
		System.out.println(total/1000000);
		long time2 = System.currentTimeMillis();
		System.out.println(time2/1000-time1/1000 + " seconds");
	}	
}
