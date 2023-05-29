package com.poly.sof3021.B9_JPA.service.impl;

import com.poly.sof3021.B9_JPA.entity.Product;
import com.poly.sof3021.B9_JPA.repository.ProductRepository;
import com.poly.sof3021.B9_JPA.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
