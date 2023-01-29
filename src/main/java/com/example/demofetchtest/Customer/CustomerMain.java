package com.example.demofetchtest.Customer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerMain {

    private final CustomerService service;

    public CustomerMain(CustomerService service){
        this.service = service;
    }

    @GetMapping
    public Iterable<Customer> getAllCustomer(){
        return service.findAll();
    }
}
