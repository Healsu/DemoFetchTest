package com.example.demofetchtest.Customer;


import com.example.demofetchtest.Items.Items;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany
    private List<Items> item;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, List<Items> item) {
        this.name = name;
        this.item = item;
    }
}
