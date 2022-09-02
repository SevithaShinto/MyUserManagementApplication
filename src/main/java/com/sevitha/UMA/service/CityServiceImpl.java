package com.sevitha.UMA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sevitha.UMA.repositories.CityRepo;

@Service
public class CityServiceImpl implements CityServiceI{

	@Autowired
	private CityRepo cityRepo;
	
}
