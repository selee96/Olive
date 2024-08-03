package com.example.olive.controller;

import com.example.olive.dto.RegisterProduct;
import com.example.olive.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderProductController {

    private final ProductService productService;

    @PostMapping("/order/product")
    public RegisterProduct.Response createProduct(
            @RequestBody @Valid RegisterProduct.Request request
    ) {
        return RegisterProduct.Response.fromEntity(
                productService.registerProduct(
                        request.getProductName(),
                        request.getProductCategory(),
                        request.getPrice(),
                        request.getQuantity()
                )
        );
    }
}
