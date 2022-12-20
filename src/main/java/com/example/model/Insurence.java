package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "InsurenceList")
public class Insurence {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private Long phNo;	
	private String gender;
	private Long SSn;

}
