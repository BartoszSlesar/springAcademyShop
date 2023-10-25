package com.bard.homework.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties(prefix = "my-shop")
@Profile({"pro", "plus"})
public class ShopConfig {
    private double vat;
    private double discount;

    public double getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = 1 + (double) vat / 100;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = (double) discount / 100;
    }
}
