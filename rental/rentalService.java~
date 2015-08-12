import java.util.*;
class rentalService 
{
	List<Building> buildings;

	rentalService(List<Building> buildings)
	{ 
		this.buildings=buildings;
	}

	public void RentAFloor(String buildingName ,int reqArea, String tenantName)
	{
		Iterator i = buildings.iterator();
		while(i.hasNext())
		{
			Building bd= (Building)i.next();	
   			if((bd.buildingName).equals(buildingName))
			{
				int availableArea = bd.vacantFloors*bd.areaOfAFloor ;
				
				if(reqArea>availableArea)
				{
					System.out.println("Required area not available! Inconvenience caused is deeply regretted");
				}
				else
				{
					int j=0;
					while(reqArea>0)
						{
							if(bd.floor.get(j).floorStatus==1)
							{	
								bd.floor.get(j).floorStatus=0;
								bd.floor.get(j).tenantName=tenantName;
								//bd.tenant.get(j).tenantName=tenantName;
								//bd.tenant.get(j).buildingName=buildingName;
								//bd.tenant.get(j).floorID=j;
								reqArea=reqArea-bd.floor.get(j).areaOfFloor;
								bd.vacantFloors--;
								System.out.println(tenantName+" "+j+" "+ buildingName);	
							}
							j++;
						}	
				}
				break;
			}	
		}
	}
	
	public void vacateAFloor(String buildingName,String tenantName, int floorID)
	{
		Iterator i = buildings.iterator();
		while(i.hasNext())
		{
			Building bd =(Building)i.next();
			if((bd.buildingName).equals(buildingName))
			{
				bd.floor.get(floorID).floorStatus=1;
				//bd.tenant.get(floorID).tenantName=null;
				bd.floor.get(floorID).tenantName=null;
				bd.vacantFloors++;
				
	 			System.out.println("vacated floor No. "+floorID+" from "+buildingName);
			
				break;
			}
	
		}

	}
	
	public void listOccupancy()
	{
		Iterator i= buildings.iterator();
		while(i.hasNext())
		{	
			Building bd= (Building)i.next();
			System.out.println(bd.buildingName+":");
			
			for(int j=0;j<bd.noOfFloors;j++)
			{
				if(bd.floor.get(j).floorStatus==0)
				{
					System.out.println(bd.floor.get(j).tenantName+" "+ j);
				}
			}
		}
	
	}
	

}
