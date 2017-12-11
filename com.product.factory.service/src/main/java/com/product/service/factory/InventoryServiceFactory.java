package com.product.service.factory;

import com.datasource.entity.Product;
import com.product.service.ProductService;
import com.product.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by thiruvengadanl on 02/12/17.
 */

@Configuration
public class InventoryServiceFactory {

    @Autowired
    ProductService productService;

    @Autowired
    SupplierService supplierService;

    @Bean
    public ProductService getProductService(){
        return productService;
    }

    @Bean
    public SupplierService getSupplierService(){
        return supplierService;
    }
}