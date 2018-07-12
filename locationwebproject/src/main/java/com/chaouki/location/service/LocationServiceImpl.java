package com.chaouki.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chaouki.location.entities.Location;
import com.chaouki.location.repo.LocationRepository;

public class LocationServiceImpl implements LocationService{

	@Autowired
	LocationRepository locationRepository ; 
	
	@Override
	public Location saveLocation(Location loc) {
		
		return locationRepository.save(loc);
		
	}

	@Override
	public Location updateLocation(Location loc) {
		return locationRepository.save(loc) ;
	}

	@Override
	public void deleteLocation(Location loc) {
		locationRepository.delete(loc);
	}

	@Override
	public Location findLocationByID(int id) {
		return locationRepository.getOne(id) ;
	}

	@Override
	public List<Location> getAllLocation() {
		return locationRepository.findAll();
	}

}
