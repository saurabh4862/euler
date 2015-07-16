import java.util.Random;
import java.io.File;
import java.lang.*;
import java.io.IOException;
import java.util.Scanner;
public class Building extends RentalService
{
	public int floor;
	public int floorlength;
	public String name;
	public String[] tenant;
	public Building(int floor,int floorlength,String name)
	{
		this.floor=floor;
		this.floorlength=floorlength;
		this.name=name;
		tenant= new String[floor];
		for(int i=0; i<floor; i++)
		{
			tenant[i]="none";
		}
	}
	public static void main(String[] args)
	{
		Building build1 = new Building(9,1200,"build1");
		Building build2 = new Building(9,1500,"build2");
		Building build3 = new Building(9,600,"build3");
// calling some funtions
		rentFloor(2800,build1,"saur");
		rentFloor(2800,build2,"saur");
		rentFloor(2000,build3,"saur");
		listOccupied(build1,build2,build3);
// input from user for rent,vacant and checking the list
		
		System.out.println("type 1 for search,type 2 for vacate ,type 3 for list");
		Scanner s =new Scanner(System.in);
		int t =s.nextInt();
		switch(t)
		{
			case 1: 
				System.out.println("print ur name then building name then req area");
				Scanner l =new Scanner(System.in);				
				String na=l.nextLine();
				String be=l.nextLine();
				String r=l.nextLine();
				int req=Integer.parseInt(r);
				if (be.equals("build1"))
				{
					rentFloor(req,build1,na);
					listOccupied(build1,build2,build3);
				}
				if (be.equals("build2"))
				{
					rentFloor(req,build2,na);
					listOccupied(build1,build2,build3);
				}
				if (be.equals("build3"))
				{
					rentFloor(req,build3,na);
					listOccupied(build1,build2,build3);
				}
				break;
			case 2:
				System.out.println("print ur name then building name then floorname");
				Scanner si =new Scanner(System.in);
				String n=si.nextLine();
				String b=si.nextLine();
				String z=si.nextLine();
				int num=Integer.parseInt(z);
				if (b.equals("build1"))
				{
					vacate(n,build1,num);
					listOccupied(build1,build2,build3);
				}
				if (b.equals("build2"))
				{
					vacate(n,build2,num);
					listOccupied(build1,build2,build3);
				}
				if (b.equals("build3"))
				{
					vacate(n,build3,num);
					listOccupied(build1,build2,build3);
				}
				break;
			case 3:
				listOccupied(build1,build2,build3);
				break;
			default:
				System.out.println("plz enter bw 1 to 3");
				break;
		}
				
				

		
		/*vacate ("saur",build1,2);
		//vacate ("saur",build1,5);
		//System.out.println(build1.floor);
		listOccupied(build1,build2,build3);*/

	}
}

