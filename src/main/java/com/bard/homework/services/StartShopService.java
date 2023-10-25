package com.bard.homework.services;

import com.bard.homework.data.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Profile({"start", "default"})
@Primary
@Service
public class StartShopService implements ShopService {

    private List<Product> cart;

    public StartShopService() {
        cart = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        this.cart.add(product);
    }

    @Override
    public void addProduct(List<Product> product) {
        this.cart.addAll(product);
    }

    @Override
    public void showProducts() {
        this.cart.forEach(product ->
                System.out.println("Name: " + product.getName() + ", price: " + product.getPrice()));
    }
}
