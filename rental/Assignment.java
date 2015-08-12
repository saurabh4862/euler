//import java.util.ArrayList;
import java.util.*;  
//import java.util.List;
class Assignment 
{
	
	public static void main(String[] args)
	{
		List<Building> buildings = new ArrayList<Building>();
		
		//for(int i=0;i<2;i++)
		buildings.add	(new Building("Build1",5,15000));
		buildings.add	(new Building("build2",6,10000));
		
		Iterator i = buildings.iterator();
		while(i.hasNext())
		{
			Building bd= (Building)i.next();	
   			System.out.println(bd.buildingName+" "+bd.areaOfAFloor+" "+bd.vacantFloors+" "+bd.noOfFloors);  
			for(int j=0;j<bd.noOfFloors;j++)
			{
				System.out.println(bd.floor.get(j).floorID+" "+bd.floor.get(j).areaOfFloor);
			}
		}
		rentalService r = new rentalService(buildings);
		r.RentAFloor("build2",60000,"Ananda"); 
		r.RentAFloor("build1",11000,"Akash");
		r.vacateAFloor("build2","Akku",0);
		r.RentAFloor("build1",11000,"me");
		r.RentAFloor("build2",11000,"sagar");
		r.listOccupancy();
		
	}
}
