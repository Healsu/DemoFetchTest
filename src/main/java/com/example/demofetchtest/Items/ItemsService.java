package com.example.demofetchtest.Items;


import com.example.demofetchtest.Customer.Customer;
import com.example.demofetchtest.Customer.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemsService {
    private final ItemsRepository repository;

    public ItemsService(ItemsRepository repository){
        this.repository = repository;
    }

    public Iterable<Items> findAll(){
        return repository.findAll();
    }
}
