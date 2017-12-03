package com.datasource.repository;

import com.datasource.entity.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by thiruvengadanl on 02/12/17.
 */
public class ProductRepository {

    String productArray = "SAMSUNG,SONY,LG,PHILIPS,MICROMAX,BPL,ONIDA";

    public List<Product> getProductArray() {
        List<Product> result = new ArrayList<Product>();
        for (String s : productArray.split(",")) {
            result.add(new Product(s));
        }
        return result;
    }
}