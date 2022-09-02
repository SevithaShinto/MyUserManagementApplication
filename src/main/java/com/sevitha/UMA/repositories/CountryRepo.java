package com.sevitha.UMA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sevitha.UMA.entities.Countries;

public interface CountryRepo extends JpaRepository<Countries, Integer>{

}
