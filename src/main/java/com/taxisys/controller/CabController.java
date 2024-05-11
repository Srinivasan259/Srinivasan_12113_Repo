package com.taxisys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.taxisys.dao.CabDAO;
import com.taxisys.enity.Cab;

import jakarta.annotation.security.PermitAll;

@RestController
@CrossOrigin("*")
public class CabController {
	
	@Autowired
	CabDAO cabdao;
	
	@PostMapping("/addCab")
	public Cab addcab(@RequestBody Cab cab) {

		return cabdao.addcab(cab);
	}
	
	@GetMapping("/allCabs")
	public	List<Cab> getAllCab() {
		return cabdao.getAllCab();
	}
	
	@GetMapping("/getCabByPickup/{pickupLocation}")
	public	List<Cab> findCabPickup(@PathVariable("pickupLocation") String pickupLocation) {
		return cabdao.findCabPickup(pickupLocation);

	}
	
	@GetMapping("/getCabByDrop/{dropLocation}")
	public	List<Cab> findCabDrop(@PathVariable("dropLocation") String dropLocation) {
		return cabdao.findCabDrop(dropLocation);
	}
	
	@GetMapping("/getCabById/{cabId}")
	public Cab findByCabId(@PathVariable("cabId") int cabId) {
		return cabdao.findByCabId(cabId);
	}
		
	@GetMapping("/getAllCabId")
	public	List<Integer> findAllCabIds() {
		return cabdao.findAllCabIds();
	}
	
}
