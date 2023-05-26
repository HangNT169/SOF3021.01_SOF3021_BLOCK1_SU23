package com.poly.sof3021.B9_JPA.service;

import com.poly.sof3021.B9_JPA.entity.Category;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();

    void add(Category category);

    void update(Category category);

    void remove(Long id);

    Page<Category> phanTrang(Integer pageNo, Integer size);

}
