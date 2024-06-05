package com.simp.me.controller;

import org.openapitools.api.TestApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements TestApi {
    @Override
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("Hello");
    }
}
