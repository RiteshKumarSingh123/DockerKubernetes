package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}
	
	public List<Customer> getCustomerList(){
		return repository.findAll();
	}

}
