//package poker_game;
import java.io.File;
import java.lang.*;
import java.io.IOException;
import java.util.Scanner;
public class Poker {
	static int sum=0;
	public static void main(String[] args) throws IOException
	{
		long time1 = System.currentTimeMillis();
		Scanner s = new Scanner(new File("/home/zemoso07/workspace/saurabh/src/poker_game/p054_poker.txt"));
		for (int i=0;i<1000;i++){
			String x=s.nextLine();
			String p1=x.substring(0,15);
			String p2=x.substring(15);
			//System.out.println(p2);
			Player player1 =new Player(p1);
			Player player2 =new Player(p2);
			Hand h =new Hand(player1,player2);
			//System.out.println(i+" "+x+" "+h.win);
			sum=sum+h.win;
		}
		System.out.println(sum);
		
		long time2 = System.currentTimeMillis();
		System.out.println(time2/1000-time1/1000 + " seconds");
		
	}

}
