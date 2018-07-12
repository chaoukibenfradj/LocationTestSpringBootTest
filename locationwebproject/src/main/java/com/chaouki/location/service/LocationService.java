package com.chaouki.location.service;

import java.util.List;

import com.chaouki.location.entities.Location;

public interface LocationService {
	
	Location saveLocation(Location loc);
	
	Location updateLocation(Location loc);
	
	void deleteLocation(Location loc);
	
	Location findLocationByID(int id);
	
	List<Location> getAllLocation();

	

}
