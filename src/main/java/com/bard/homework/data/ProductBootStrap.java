package com.bard.homework.data;


import com.bard.homework.services.ShopService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

@Component
public class ProductBootStrap implements CommandLineRunner {

    private final ShopService shopService;

    public ProductBootStrap(ShopService shopService) {
        this.shopService = shopService;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }


    private void loadData() {
        Random random = new Random();
        Product product1 = new Product("headphones", random.nextInt(250) + 50);
        Product product2 = new Product("Dog Food", random.nextInt(250) + 50);
        Product product3 = new Product("Book", random.nextInt(250) + 50);
        Product product4 = new Product("Shoes", random.nextInt(250) + 50);
        Product product5 = new Product("hoodie", random.nextInt(250) + 50);
        this.shopService.addProduct(Arrays.asList(product1, product2, product3, product4, product5));


    }


}
