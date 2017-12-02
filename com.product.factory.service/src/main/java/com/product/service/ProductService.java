package com.product.service;

import java.util.ArrayList;
import java.util.List;
import com.product.datasource.Product;

/**
 * Created by thiruvengadanl on 02/12/17.
 */
public class ProductService {

    public List<String> getProducts(){

       return new Product().getProductArray();
    }
}
