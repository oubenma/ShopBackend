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
@Table(name ="product")

public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",  nullable = false)
    private int id;
    private String name;
    private float salePrice;
    private float oldPrice;
    private  String pathNamePicture;
    private String description;
    private int quantityStock;
    @OneToOne
    private Categorie categorie;
    @OneToMany
    private List<Tags> tags;
    @OneToMany
    private List<Review> reviews;
    @OneToMany
    private List<Orderitems> orderitems;
    @OneToMany
    private List<Picture> pictures;



    
    
}

