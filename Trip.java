package com.uber.analysis;

 
public class Trip
{
  
private int tripId;
  
private int driverId;
  
private int passengerId;
  
private String startTime;
  
private String endTime;
  
private double distanceKm;
  
private double fareAmount;
  
 
public Trip (int tripId, int driverId, int passengerId, String startTime,
				  String endTime, double distanceKm, double fareAmount)
  {
	
this.tripId = tripId;
	
this.driverId = driverId;
	
this.passengerId = passengerId;
	
this.startTime = startTime;
	
this.endTime = endTime;
	
this.distanceKm = distanceKm;
	
this.fareAmount = fareAmount;
  
} 
 
public int getTripId ()
  {
	
return tripId;
  
}
  
 
public int getDriverId ()
  {
	
return driverId;
  
}
  
 
public int getPassengerId ()
  {
	
return passengerId;
  
}
  
 
public String getStartTime ()
  {
	
return startTime;
  
}
  
 
public String getEndTime ()
  {
	
return endTime;
  
}
  
 
public double getDistanceKm ()
  {
	
return distanceKm;
  
}
  
 
public double getFareAmount ()
  {
	
return fareAmount;
  
}

}


