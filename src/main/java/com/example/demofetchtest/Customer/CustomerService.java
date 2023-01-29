package com.example.demofetchtest.Customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository){
        this.repository = repository;
    }

    public Iterable<Customer> findAll(){
        return repository.findAll();
    }
}
