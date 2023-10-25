package com.bard.homework.controller;


import com.bard.homework.services.ShopService;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;

import java.util.Random;

@Controller
public class MyShopController {

    private final ShopService shopService;


    public MyShopController(ShopService shopService) {
        this.shopService = shopService;
    }


    @EventListener(ApplicationReadyEvent.class)
    public void getProducts() {
        shopService.showProducts();
    }


}
