package com.datasource.Adapter.service;

import com.datasource.Adapter.ProductAdapter;
import com.datasource.Adapter.SupplierAdapter;
import com.datasource.entity.Product;
import com.datasource.entity.Supplier;
import com.datasource.repository.ProductRepository;
import com.datasource.repository.SupplierRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thiruvengadanl on 03/12/17.
 */
public class SupplierAdapterService implements SupplierAdapter {

    public List<Supplier> getSupplier() {
        return new SupplierRepository().getSupplierArray();
    }
}
