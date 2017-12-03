package com.product.service;

import java.util.ArrayList;
import java.util.List;

import com.datasource.Adapter.service.ProductAdapterService;
import com.datasource.entity.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by thiruvengadanl on 02/12/17.
 */

public class ProductService {


    public List<Product> getProduct(){
        return new ProductAdapterService().getProduct();
    }
}
