package com.springcrudweek.amirahapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springcrudweek.amirahapi.model.Product;



public interface ProductRepository extends JpaRepository<Product, Long>{
}
