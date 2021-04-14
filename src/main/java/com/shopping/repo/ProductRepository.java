package com.shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.model.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {

}
