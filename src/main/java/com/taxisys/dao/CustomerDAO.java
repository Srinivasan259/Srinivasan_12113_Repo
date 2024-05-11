package com.taxisys.dao;

import java.util.List;

import com.taxisys.enity.Customer;


public interface CustomerDAO{

	public	List<Customer> getAllcustomers();
	
	public List<Integer> findAllCustomerIds();
	
	public Customer findCustomerId(int customerId);



	
	
}
