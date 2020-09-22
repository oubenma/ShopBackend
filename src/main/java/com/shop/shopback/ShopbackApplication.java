package com.shop.shopback;

import com.shop.shopback.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


@SpringBootApplication
public class ShopbackApplication implements CommandLineRunner {

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;
    public static void main(String[] args) {
        SpringApplication.run(ShopbackApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Admin.class);
        repositoryRestConfiguration.exposeIdsFor(Address.class);
        repositoryRestConfiguration.exposeIdsFor(Categorie.class);
        repositoryRestConfiguration.exposeIdsFor(Customer.class);
        repositoryRestConfiguration.exposeIdsFor(Order.class);
        repositoryRestConfiguration.exposeIdsFor(Orderitems.class);
        repositoryRestConfiguration.exposeIdsFor(Picture.class);
        repositoryRestConfiguration.exposeIdsFor(Review.class);
        repositoryRestConfiguration.exposeIdsFor(Tags.class);
        repositoryRestConfiguration.exposeIdsFor(Product.class);

    }

}
