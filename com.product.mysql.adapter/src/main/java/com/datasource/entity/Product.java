package com.datasource.entity;

/**
 * Created by thiruvengadanl on 03/12/17.
 */
public class Product {

    public Product(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
