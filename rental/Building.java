import java.util.*;
public class Building
{
	String buildingName;
	int noOfFloors;
	int areaOfAFloor;
	int vacantFloors;
	List<Floor> floor = new ArrayList<Floor>();
	List<Tenant> tenant = new ArrayList<Tenant>();

	Building(String buildingName,int noOfFloors,int areaOfAFloor)
	{
		this.buildingName = buildingName;
		this.noOfFloors = noOfFloors;
		this.areaOfAFloor = areaOfAFloor;
		vacantFloors	= noOfFloors;
	
		for(int i=0;i<noOfFloors;i++)
		{
			floor.add(new Floor(areaOfAFloor,i));
		}
	}
}	
	
class Floor
{
	String tenantName;
	int floorStatus=1;
	int areaOfFloor;
	int floorID;

	Floor(int areaOfFloor,int floorID)
	{
		this.areaOfFloor=areaOfFloor;
		this.floorID=floorID;
	}
}
	
class Tenant
{
	String tenantName;
	Building building;
	List<Floor> floor;
	
	Tenant(String tenantName,Building b)
	{
		this.tenantName=tenantName;
		this.building=building;
		floor.add()
	}
}
