package com.product.datasource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by thiruvengadanl on 02/12/17.
 */
public class Product {

    String productArray = "SAMSUNG,SONY,LG,PHILIPS,MICROMAX,BPL,ONIDA";

    public List<String> getProductArray() {
        return Arrays.asList(productArray.split(","));
    }
}