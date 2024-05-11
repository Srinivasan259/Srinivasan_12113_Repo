package com.taxisys;


import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.taxisys.controller.CustomerController;
import com.taxisys.enity.Customer;

@SpringBootTest
class JunitForCustomerController {
	
	@Autowired
	private CustomerController customerController;

	@Test
	void testforSearch() {
		Customer customer=new Customer();
		customer=customerController.findCustomerId(3);
		assertEquals(customer.getCustomerName(), "Srinivasan");;
	}
	
	@Test
	void testforAllCustomers() {
		List<Customer> customer=customerController.getAllcustomers();
		assertNotNull(customer);
}
}
