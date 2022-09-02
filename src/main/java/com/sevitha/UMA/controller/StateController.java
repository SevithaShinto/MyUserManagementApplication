package com.sevitha.UMA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sevitha.UMA.service.StateServiceI;

@RestController
public class StateController {

	@Autowired
	private StateServiceI stateServiceI;
	
}
