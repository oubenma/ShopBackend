package com.shop.shopback.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="picture")
public class Picture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String path;

	@ManyToOne
	private Product product;

}
