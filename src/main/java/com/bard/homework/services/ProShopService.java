package com.bard.homework.services;


import com.bard.homework.config.ShopConfig;
import com.bard.homework.data.Product;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Profile("pro")
@Service
public class ProShopService implements ShopService {

    private List<Product> cart;
    private final ShopConfig shopConfig;

    public ProShopService(ShopConfig shopConfig) {
        this.shopConfig = shopConfig;
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
        this.cart.forEach(product -> {
            double price = product.getPrice() * shopConfig.getVat();
            double discount = price - (price * shopConfig.getDiscount());
            String prodDesc = "Name: " + product.getName()
                    + ", price: " + product.getPrice()
                    + ", price+vat: " + price
                    + ", price after discount: " + discount;
            System.out.println(prodDesc);
        });
    }
}
