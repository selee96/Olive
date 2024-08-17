package com.example.olive.controller;

import com.example.olive.dto.Order;
import com.example.olive.dto.OrderProductDto;
import com.example.olive.service.OrderProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class OrderProductController {
    private final OrderProductService orderProductService;

    @PostMapping("/order")
    public Order.Response orderProduct(
            @RequestBody @Valid Order.Request reqeust
            ) {
        return Order.Response.from(orderProductService.orderProduct(reqeust));
    }
}
