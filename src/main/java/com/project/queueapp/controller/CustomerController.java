package com.project.queueapp.controller;


import com.project.queueapp.dto.CustomerSignupRequest;
import com.project.queueapp.model.Customer;
import com.project.queueapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/signup")
    public Customer signup(@RequestBody CustomerSignupRequest request) {
        return customerService.register(request);
    }
}
