package com.example.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Insurence;
import com.example.repository.InsurenceRepository;
@Service
public class InsurenceServiceImpl implements InsurenceService {
	@Autowired
	private InsurenceRepository repository;

	

	@Override
	public List<Insurence> findAllEmployees() {
		return repository.findAll();
	}
	
	

}
