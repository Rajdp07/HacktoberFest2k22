package com.nayan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nayan.dto.OrderRequest;
import com.nayan.dto.OrderResponse;
import com.nayan.model.Customer;
import com.nayan.repository.CustomerRepository;
import com.nayan.repository.ProductRepository;

@RestController
@RequestMapping("/demo")
public class CustomerController {

	@Autowired
	private CustomerRepository crepo;
	@Autowired
	private ProductRepository prepo;
	
	@PostMapping("/save")
	public Customer saveOrder(@RequestBody OrderRequest request) {
		return crepo.save(request.getCustomer());
	}
	
	@GetMapping("/info")
	public List<OrderResponse> getInfo() {
	return crepo.getInfo();	
	}
	
	
	
}
