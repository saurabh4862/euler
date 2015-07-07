import java.util.Random;
import java.io.File;
import java.lang.*;
import java.io.IOException;
import java.util.Scanner;
public class ChasePlayer{
	public int pos;
	public ChasePlayer(int p)
	{
		this.pos=p;
	}
	public void position(int r)
	{
		if (r==1)
		{
			if (pos==1)pos=100;
			else pos=pos-1;
		}
		else if (r==6)
		{
			if (pos==100) pos=1;
			else pos=pos+1;
		}
		else
			pos=pos;
	}
}
