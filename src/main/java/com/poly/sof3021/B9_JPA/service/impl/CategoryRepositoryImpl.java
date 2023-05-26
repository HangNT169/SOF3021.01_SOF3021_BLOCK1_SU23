package com.poly.sof3021.B9_JPA.service.impl;

import com.poly.sof3021.B9_JPA.entity.Category;
import com.poly.sof3021.B9_JPA.repository.CateRepository;
import com.poly.sof3021.B9_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryRepositoryImpl implements CategoryService {

    @Autowired
    private CateRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void add(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void update(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void remove(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Page<Category> phanTrang(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        return categoryRepository.findAll(pageable);
    }
    // Them , Sua => save
    // xoa : dele
}
