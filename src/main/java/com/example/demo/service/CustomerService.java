package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.CustomerController;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	
	private static final	Logger loggers = LoggerFactory.getLogger(CustomerService.class);
	
	@Autowired
	private CustomerRepository repository;
	
	public Customer saveCustomer(Customer customer) {
		loggers.debug("saveCustomer called in service");
		return repository.save(customer);
	}
	
	public List<Customer> getCustomerList(){
		return repository.findAll();
	}

}
