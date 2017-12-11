package com.datasource.repository;

import com.datasource.config.InventoryJDBCTemplate;
import com.datasource.entity.Product;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by thiruvengadanl on 02/12/17.
 */
@Service
public class ProductRepository extends InventoryJDBCTemplate{

    public List<Product> getProductArray() {

        return query("select * from PRODUCT",new ResultSetExtractor<List<Product>>(){
            public List<Product> extractData(ResultSet rs) throws SQLException,
                    DataAccessException {

                List<Product> list=new ArrayList<Product>();
                while(rs.next()){
                    Product e= new Product();
                    e.setId(rs.getInt(1));
                    e.setName(rs.getString(2));
                    e.setSupplier(rs.getInt(3));
                    list.add(e);
                }
                return list;
            }
        });
    }
}