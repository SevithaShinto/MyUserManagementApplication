package com.sevitha.UMA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sevitha.UMA.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
