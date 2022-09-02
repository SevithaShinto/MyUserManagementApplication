package com.sevitha.UMA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sevitha.UMA.repositories.CountryRepo;

@Service
public class CountryServiceImpl implements CountryServiceI {

	@Autowired
	private CountryRepo countryRepo;
	
}
