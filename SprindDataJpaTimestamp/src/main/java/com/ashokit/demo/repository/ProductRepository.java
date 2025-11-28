package com.ashokit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.demo.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
  
}
