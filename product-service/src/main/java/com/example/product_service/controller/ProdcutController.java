package com.example.product_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProdcutController {
    @GetMapping("/health")
    public String health() {
        return "Product Service Running! - Pipeline v1";
    }
}
