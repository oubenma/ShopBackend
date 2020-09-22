package com.shop.shopback.repository;

import com.shop.shopback.models.Orderitems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderitemsRepository extends JpaRepository<Orderitems,Integer> {
}
