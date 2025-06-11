package com.tttravel.TravelApp.service;

import java.util.List;

import com.tttravel.TravelApp.model.Location;

public interface ILocationService {
	public String addLocation(Location location);
	public String updateLocation(Location location);
	public String deleteLocationById(long id);
	public List<Location> getAllLocation();
	public Location getLocationById(long id);
}
