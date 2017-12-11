package com.datasource.Adapter.service;

import com.datasource.Adapter.ProductAdapter;
import com.datasource.entity.Product;
import com.datasource.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thiruvengadanl on 03/12/17.
 */
@Service
public class ProductAdapterService implements ProductAdapter {

    @Autowired
    ProductRepository productRepository;

    public void saveProduct() {}

    public List<Product> getProductBySupplier() {
        return null;
    }

    public List<Product> getProduct() {
        return productRepository.getProductArray();
    }
}