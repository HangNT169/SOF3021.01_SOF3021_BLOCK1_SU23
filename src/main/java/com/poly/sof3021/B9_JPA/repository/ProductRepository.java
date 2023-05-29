package com.poly.sof3021.B9_JPA.repository;

import com.poly.sof3021.B9_JPA.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
