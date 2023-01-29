package com.example.demofetchtest.Items;


import com.example.demofetchtest.Customer.Customer;
import com.example.demofetchtest.Customer.CustomerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/items")
public class ItemsMain {
    private final ItemsService service;

    public ItemsMain(ItemsService service){
        this.service = service;
    }

    @GetMapping
    public Iterable<Items> getAllItems(){
        return service.findAll();
    }
}
