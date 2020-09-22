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
@Table(name="orderr")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",  nullable = false)
    private int id;
    private String dateOrder;

    @OneToMany
    private List<Orderitems> orderitems;
    @OneToOne
    private Customer customer;

}

