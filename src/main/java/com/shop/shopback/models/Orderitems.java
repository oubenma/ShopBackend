package com.shop.shopback.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="order_items")

public class Orderitems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",  nullable = false)
    private int id;
    private int quantity;

    @OneToOne
    private Order order;
    @OneToOne
    private Product product;
}



