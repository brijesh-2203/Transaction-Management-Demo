package com.apigateway.apigateway.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userServiceFallBack")
    public String  userServiceFallBack()
    {
        return "UserService is Down !!!";
    }

    @GetMapping("/addressServiceFallBack")
    public String  addressServiceFallBack()
    {
        return "AddressService is Down !!1";
    }
}
