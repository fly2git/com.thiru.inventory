package com.product.service;

import java.util.ArrayList;
import java.util.List;

import com.datasource.Adapter.service.ProductAdapterService;
import com.datasource.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by thiruvengadanl on 02/12/17.
 */

@Service
public class ProductService {

    @Autowired
    ProductAdapterService productAdapterService;

    public void saveProduct(){}

    public List<Product> getProduct(){
        return productAdapterService.getProduct();
    }
}
