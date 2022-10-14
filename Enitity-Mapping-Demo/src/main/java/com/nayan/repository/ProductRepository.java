package com.nayan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nayan.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
