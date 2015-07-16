import java.io.IOException;
public class RentalService extends IllegalArgumentException
{
	public static void rentFloor(int reqfloor,Building build,String tenantname)
	{
		int sum=0;
		for(int i=0;i<build.floor;i++)
		{
			if (build.tenant[i]=="none")
				sum=sum+1;		
		}
		if (sum==0)
			throw new IllegalArgumentException("no vacate floor available");

		if(reqfloor < build.floorlength)
			throw new IllegalArgumentException("dcdvfvc");
		else
		{		
			int m= reqfloor/build.floorlength;
			int n=reqfloor%build.floorlength;
			int count=0;
			for(int i=0;i<build.floor;i++)
			{
				if (build.tenant[i]=="none")
					count++;
			}
			if (count>=m)
			{
				if (n==0)
				{
					int count1=0;	
					for(int i=0;i<build.floor;i++)
					{
						if(build.tenant[i]=="none")
						{
							build.tenant[i]=tenantname;
							count1++;
							if (count1==m)
								break;	
						}
					}
				}
				else
				{
					int count1=0;	
					for(int i=0;i<build.floor;i++)
					{
						if(build.tenant[i]=="none")
						{
							build.tenant[i]=tenantname;
							count1++;
							if (count1==m+1)
								break;	
						}
					}

				}
			}
			else
				throw new IllegalArgumentException("no floor available");	
		}
	}
	public static void vacate(String name,Building build,int num)
	{
		if (build.tenant[num-1].equals(name))
			build.tenant[num-1]="none";
		else
			throw new IllegalArgumentException("already vacate");
	}
	public static void listOccupied(Building...build)
	{
		int n= build.length;
		for(int i=0; i<n; i++)
		{
			System.out.println(build[i].name);
			for(int j=0; j<build[i].floor; j++)
			{
				System.out.println(build[i].tenant[j]);
			}
		}	
	}
}

