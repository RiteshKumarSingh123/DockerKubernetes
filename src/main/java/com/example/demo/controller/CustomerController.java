package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
private static final	Logger loggers = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerService customerService;

	@PostMapping("saveCustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		loggers.debug("saveCustomer called");
		return customerService.saveCustomer(customer);
	}
	
	@GetMapping("customerList")
	public List<Customer> getCustomerList(){
		return customerService.getCustomerList();
	}
}
