package com.example.olive.controller;

import com.example.olive.dto.RegisterProduct;
import com.example.olive.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/product")
    public RegisterProduct.Response registerProduct(
            @RequestBody @Valid RegisterProduct.Request reqeust
            ) {
        productService.registerProduct(reqeust);
        return null;
    }
}
