package com.shop.shopback.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="product")
public class Product {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private float salePrice;
    private float oldPrice;
    private int value;
    private  String imageUrl;
    private String description;
    private int quantityStock;
    @ManyToOne(fetch = FetchType.EAGER)
    private Categorie categorie;
    @ManyToOne
    private Tags tags;
    @OneToMany(mappedBy = "product")
    private List<Review> reviews;
    @OneToMany(mappedBy = "product")
    private List<Orderitems> orderItems;
    @OneToMany(mappedBy = "product")
    private List<Picture> pictures;

}

