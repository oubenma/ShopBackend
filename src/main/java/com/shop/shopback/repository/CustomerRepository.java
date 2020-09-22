package com.shop.shopback.repository;


import com.shop.shopback.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
