package com.shop.shopback.repository;

import com.shop.shopback.models.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PictureRepository extends JpaRepository<Picture,Integer> {
}
