package com.thoughtmechanix.licenses.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RefreshScope
public class LicenseServiceController {
    @Value("${my.greeting}")
    private String greetingMessage;

    @GetMapping("/greeting")
    public String greeting(){
        return "my.greeting: " + greetingMessage ;
    }
}
