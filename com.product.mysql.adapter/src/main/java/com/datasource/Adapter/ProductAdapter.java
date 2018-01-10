package com.datasource.Adapter;

import com.datasource.entity.Product;
import com.datasource.entity.Supplier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thiruvengadanl on 03/12/17.
 */
public interface ProductAdapter {

    void saveProduct(String productName,int supplierId);
    List<Product>  getProductBySupplier();
    List<Product> getProduct();
}
