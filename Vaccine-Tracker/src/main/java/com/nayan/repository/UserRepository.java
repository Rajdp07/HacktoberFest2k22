package com.nayan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nayan.model.User;



public interface UserRepository  extends JpaRepository<User,Long>{
User findByName(String name);

}
