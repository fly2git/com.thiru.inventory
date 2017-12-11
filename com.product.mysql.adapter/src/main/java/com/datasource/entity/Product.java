package com.datasource.entity;

/**
 * Created by thiruvengadanl on 03/12/17.
 */
public class Product {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSupplier() {
        return supplier;
    }

    public void setSupplier(int supplier) {
        this.supplier = supplier;
    }

    private int id;
    private String name;
    private int supplier;
}
