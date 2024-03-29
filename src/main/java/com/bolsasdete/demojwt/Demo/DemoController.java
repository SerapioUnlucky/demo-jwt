package com.bolsasdete.demojwt.Demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DemoController {
    
    @PostMapping(value = "demo")
    public String welcome() {

        return "Welcome from secure endpoint";

    }
    
}
