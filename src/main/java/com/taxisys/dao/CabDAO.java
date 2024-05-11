package com.taxisys.dao;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.taxisys.enity.Cab;


public interface CabDAO {

	public Cab addcab( Cab cab);
	
	public	List<Cab> getAllCab();

	public	List<Cab> findCabPickup(String pickupLocation);

	public	List<Cab> findCabDrop( String dropLocation);

	public Cab findByCabId( int cabId);
	
	public	List<Integer> findAllCabIds();



}
