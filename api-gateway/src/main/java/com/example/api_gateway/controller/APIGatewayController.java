package com.example.api_gateway.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/gateway")
public class APIGatewayController {
    @GetMapping("/health")
    public String health() {
        return "API GateWay Running! - Pipeline v1";
    }
 }
