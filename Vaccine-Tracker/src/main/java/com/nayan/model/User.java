package com.nayan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "USER")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long userId;
private String name;
private String email;
private int age;
private String district;
private String vaccineCenter;

}
