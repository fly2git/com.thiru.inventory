package com.datasource.entity;

/**
 * Created by thiruvengadanl on 03/12/17.
 */
public class Supplier {

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

    private int id;
    private String name;
}