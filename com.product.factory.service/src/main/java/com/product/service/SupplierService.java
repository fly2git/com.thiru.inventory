package com.product.service;

import com.datasource.Adapter.ProductAdapter;
import com.datasource.Adapter.SupplierAdapter;
import com.datasource.Adapter.service.ProductAdapterService;
import com.datasource.Adapter.service.SupplierAdapterService;
import com.datasource.entity.Product;
import com.datasource.entity.Supplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by thiruvengadanl on 02/12/17.
 */

public class SupplierService {

    private SupplierAdapter supplierAdapter;

    public List<Supplier> getSupplier(){
       return new SupplierAdapterService().getSupplier();
    }
}
