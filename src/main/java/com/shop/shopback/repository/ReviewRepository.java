package com.shop.shopback.repository;


import com.shop.shopback.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ReviewRepository extends JpaRepository<Review,Integer> {

    }

