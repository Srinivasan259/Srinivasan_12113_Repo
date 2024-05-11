package com.taxisys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.taxisys.dao.CustomerDAO;
import com.taxisys.enity.Customer;

@RestController
@CrossOrigin("*")
public class CustomerController {

	@Autowired
	CustomerDAO custdao;

	@GetMapping("/allCustomers")
	public List<Customer> getAllcustomers() {
		return custdao.getAllcustomers();
	}

	@GetMapping("/getAllCustomerId")
	public List<Integer> findAllCustomerIds() {
		return custdao.findAllCustomerIds();
	}

	@GetMapping("/getCustById/{customerId}")
	public Customer findCustomerId(@PathVariable("customerId") int customerId) {
		return custdao.findCustomerId(customerId);

	}
}
