package com.shop.shopback.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",  nullable = false)
    private int id;
    private String comment;
    private  int stars;
    @OneToOne
    private  Customer customer;
    @OneToOne
    private Product product;


}


