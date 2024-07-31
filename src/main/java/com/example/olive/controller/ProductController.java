package com.example.olive.controller;

import com.example.olive.dto.RegisterProduct;
import com.example.olive.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/product/create")
    public RegisterProduct.Response createProduct(
            @RequestBody RegisterProduct.Request request
    ) {
        return RegisterProduct.Response.fromEntity(
                productService.registerProduct(
                        request.getProductId(),
                        request.getProductName(),
                        request.getProductCategory(),
                        request.getPrice(),
                        request.getQuantity()
                )
        );
    }
}
