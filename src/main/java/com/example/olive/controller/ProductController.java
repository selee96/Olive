package com.example.olive.controller;

import com.example.olive.service.RedisTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final RedisTestService redisTestService;

    @GetMapping("/get-lock")
    public String getLock() {
        return redisTestService.getLock();
    }
}
