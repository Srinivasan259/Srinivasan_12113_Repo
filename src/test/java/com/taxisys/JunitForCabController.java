package com.taxisys;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.taxisys.controller.CabController;
import com.taxisys.enity.Cab;

@SpringBootTest
class JunitForCabController {

	@Autowired
	private CabController cabController;

	@Test
	void testforSearch() {
		Cab cab = new Cab();
		cab = cabController.findByCabId(2);
		assertNotNull(cab);

	}

	@Test
	void testforSearchPickup() {
		List<Cab> cab =  new  ArrayList<Cab>();
		cab = cabController.findCabPickup("Neyveli");
		assertNotNull(cab);

	}

	@Test
	void testforSearchDrop() {
		List<Cab> cab =  new ArrayList<Cab>();
		cab = cabController.findCabDrop("Chennai");
		assertNotNull(cab);

	}

	@Test
	void testforAllCabs() {
		List<Cab> cab = cabController.getAllCab();
		assertNotNull(cab);

	}

}
