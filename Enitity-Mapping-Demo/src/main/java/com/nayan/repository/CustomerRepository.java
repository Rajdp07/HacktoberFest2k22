package com.nayan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nayan.dto.OrderResponse;
import com.nayan.model.Customer;



public interface CustomerRepository extends JpaRepository<Customer, Integer> {



@Query("Select new com.nayan.dto.OrderResponse(c.name,p.productName) from Customer c JOIN c.products p")
public List<OrderResponse> getInfo();


}
