package com.sevitha.UMA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sevitha.UMA.repositories.StateRepo;

@Service
public class StateServiceImpl implements StateServiceI {

	@Autowired
	private StateRepo stateRepo;
	
	
}
