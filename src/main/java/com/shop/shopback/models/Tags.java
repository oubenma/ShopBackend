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
@Table(name ="tags")
public class Tags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",  nullable = false)
    private int id;
    private String name;

    @OneToMany
    private List<Product> products;

}
