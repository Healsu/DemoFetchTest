package com.example.demofetchtest;

import com.example.demofetchtest.Customer.Customer;
import com.example.demofetchtest.Customer.CustomerRepository;
import com.example.demofetchtest.Items.Items;
import com.example.demofetchtest.Items.ItemsRepository;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoFetchTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoFetchTestApplication.class, args);
    }

    @Bean
    public CommandLineRunner importData(ItemsRepository itemsRepository,
                                        CustomerRepository customerRepository

    ) {
        return (args) -> {

            List<Items> emptyList = new ArrayList<>();

            final List<Items> itemsList = new ArrayList<>();
            itemsList.add(new Items("Samsung Galaxy 8",2));
            itemsRepository.saveAll(itemsList);

            final List<Customer> customerList = new ArrayList<>();
            customerList.add(new Customer("Samuela",emptyList));
            customerRepository.saveAll(customerList);
        };
    }
}
