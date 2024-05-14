package com.dressify.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sample")


public  class Sample {

    @GetMapping("/hello")
    public ResponseEntity<?> demoController() {
        return ResponseEntity.ok("success");
    }

}
