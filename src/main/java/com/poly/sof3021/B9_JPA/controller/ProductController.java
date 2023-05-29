package com.poly.sof3021.B9_JPA.controller;

import com.poly.sof3021.B9_JPA.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/hien-thi")
    public String hienThiProduct(Model model){
        model.addAttribute("listProduct", productService.getAll());
        return "/buoi10/view-product";
    }
}
