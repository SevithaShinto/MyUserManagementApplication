package com.sevitha.UMA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sevitha.UMA.service.CityServiceI;

@RestController
public class CityController {

	@Autowired
	private CityServiceI cityServiceI;
	
}
