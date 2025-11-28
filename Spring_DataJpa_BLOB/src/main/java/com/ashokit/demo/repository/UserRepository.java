package com.ashokit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.demo.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}

