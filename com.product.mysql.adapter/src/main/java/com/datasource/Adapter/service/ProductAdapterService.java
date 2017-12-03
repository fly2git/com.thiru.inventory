package com.datasource.Adapter.service;

import com.datasource.Adapter.ProductAdapter;
import com.datasource.entity.Product;
import com.datasource.repository.ProductRepository;

import java.util.List;

/**
 * Created by thiruvengadanl on 03/12/17.
 */
public class ProductAdapterService implements ProductAdapter {

    public List<Product> getProduct() {
        return new ProductRepository().getProductArray();
    }
}
