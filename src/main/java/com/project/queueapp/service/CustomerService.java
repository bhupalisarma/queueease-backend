package com.project.queueapp.service;

import com.project.queueapp.dto.CustomerSignupRequest;
import com.project.queueapp.model.Customer;
import com.project.queueapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    @Autowired
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer register(CustomerSignupRequest request) {
//        Customer customer = Customer.builder()
//                .fullName(request.getFullName())
//                .email(request.getEmail())
//                .phone(request.getPhone())
//                .password(request.getPassword())
//                .build();


        Customer customer = Customer.builder()
                .fullName(request.getFullName())
                .email(request.getEmail())
                .phone(request.getPhone())
                .password(request.getPassword())
                .build();
        return repository.save(customer);
    }
}
