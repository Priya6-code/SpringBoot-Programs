package com.Ashokit.Demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ashokit.Demo.Entity.Address;

public interface AddressRepository extends JpaRepository<Address, Serializable> {
}

