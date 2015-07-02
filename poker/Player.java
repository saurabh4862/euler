//package poker_game;

import java.util.Arrays;
import java.util.Collections;
public class Player {
	public char[] suit = new char[5];
	public int[] value= new int[5];
	public int[] freq=new int[5];
	public int[] same= new int[5];
	public void decending(int[] value)
	{
		int t;
		for (int i=0;i<3;i++)
		{
			t=value[i];
			value[i]=value[4-i];
			value[4-i]=t;
		}
	}
	public Player(String s)
	{
		int j=0;
		for (int i=0;j<5;i+=3,j++)
		{
			if (s.charAt(i)=='A') value[j]=14;
			else if (s.charAt(i)=='T') value[j]=10;
			else if (s.charAt(i)=='J') value[j]=11;
			else if (s.charAt(i)=='Q') value[j]=12;
			else if (s.charAt(i)=='K') value[j]=13;
			else
			{
				value[j]=(int)s.charAt(i)-'0';
			}
			//System.out.println(value[j]);
		
		
			suit[j]=s.charAt(i+1);
			
		}
		Arrays.sort(value);
		decending(value);
	}
	public boolean flush(char[] suit)
	{
		int t =(int) suit[0];
		for (int i=1;i<5;i++)
		{
			int x=(int) suit[i];
			if (t!=x)
				return false;
		}
		//System.out.println("flush");
		return true;
	} 
	public boolean consi(int[] value)
	{
		if (value[0]==14 &&value[1]==5 && value[2]==4 && value[3]==3 &&value[4]==2)
			return true;
		else
		{
			int ma=value[0];
			for ( int i=1;i<5;i++)
			{
				if (ma-value[i]!=1)
					return false;
				else
					ma=value[i];
			}
		//System.out.println("consi");
		return true;
		}
	}
	public void frequency(int[] value)
	{
		/*if((value[0]==value[1]==value[2]==value[3]) || (value[4]==value[1]==value[2]==value[3])) f[0]=4;
		else { 
		for(int i=0;i<3;i++) 
		if(a[i]==a[i+2]) f[0]=3;
		}
		for(int i=0;i<4;i++)
		{
			if(value[i]==value[i+1]) count=count+1;
			
			
		}*/
		int add=0;
		int i=0;
		while(i<5)
		{
			int count=0;
			for (int j:value)
			{
				if (value[i]==j)
					count=count+1;
			}
			freq[add] =count;
			add++;
			i=i+count;
		}
		Arrays.sort(freq);
		decending(freq);
	}
	public void sam(int[] freq)
	{
		if (freq[0]==4)
		{
			//int[] same= new int[2];
			for (int i: value)
			{
				int count=0;
				for (int j:value)
				{
					if (i==j)
						count=count+1;
				}
				if (count==4)
					same[0] =i;
				if (count==1)
					same[1]=i;		
			}	
		}
		else if (freq[0]==3)
		{
			int add=0;
			for (int i: value)
			{
				int count=0;
				for (int j:value)
				{
					if (i==j)
						count=count+1;
				}
				if (count==3)
				{
					 //same= new int[1];
					same[add++] =i;
				}
			}
			
			if (freq[1]==1)
			{
				for (int i: value)
				{
					if (i!=same[0])
					{
						// same= new int[1];
						same[add++] =i;
					}
				}
			}
			else
			{
				for (int i:value)
				{
					if (i!=same[0])
					{
						 //same= new int[1];
						same[1] =i;
					}
				}
			
				
				
			}		
		}
		else if (freq[0]==2)
		{
			int add=0;
			for (int i: value)
			{
				int count=0;
				for (int j:value)
				{
					if (i==j)
						count=count+1;
				}
				if (count==2)
				{
					 //same= new int[1];
					same[add++] =i;
				}
			}
			for (int i: value)
			{
				int count=0;
				for (int j:value)
				{
					if (i==j)
						count=count+1;
				}
				if (count==1)
				{
					 //same= new int[1];
					same[add++] =i;
				}
			}
		}	
	}
	
}
