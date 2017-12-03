package com.datasource.repository;

import com.datasource.entity.Supplier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thiruvengadanl on 02/12/17.
 */
public class SupplierRepository {

    String supplierArray = "SAMSUNGSupplier,SONYSupplier,LGSupplier,PHILIPSSupplier,MICROMAXSupplierSupplier,BPLSupplier,ONIDASupplier";

    public List<Supplier> getSupplierArray() {
        List<Supplier> result = new ArrayList<Supplier>();
        for (String s : supplierArray.split(",")) {
            result.add(new Supplier(s));
        }
        return result;
    }
}