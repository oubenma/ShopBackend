package com.shop.shopback.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String firstName;
        private  String lastName;
        private String email;
        private String password;
        private String phoneNumber;
        @OneToMany(mappedBy ="customer" )
        private List<Review> reviews;
        @OneToOne
        private Address address;
        @OneToMany(mappedBy ="customer" )
           private List<Order> orders;
}
