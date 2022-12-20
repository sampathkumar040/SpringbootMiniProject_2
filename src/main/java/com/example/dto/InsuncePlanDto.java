package com.example.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="planeTable")
public class InsuncePlanDto {
	
	private String planeName;
	private String planeStatus;
	private Date startDate;
	private  Date endDate;
	

}
