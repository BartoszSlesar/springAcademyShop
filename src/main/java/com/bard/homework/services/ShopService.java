package com.bard.homework.services;

import com.bard.homework.data.Product;

import java.util.List;

public interface ShopService {

    void addProduct(Product product);
    void addProduct(List<Product> product);
    void showProducts();
}
