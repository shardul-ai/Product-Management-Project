package com.becoder.Product_Managment_Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.becoder.Product_Managment_Backend.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
