package com.datasource.repository;

import com.datasource.config.InventoryJDBCTemplate;
import com.datasource.entity.Product;
import com.datasource.entity.Supplier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by thiruvengadanl on 02/12/17.
 */
public class SupplierRepository extends InventoryJDBCTemplate {

    public List<Supplier> getSupplierArray() {
        return query("select * from PRODUCT",new ResultSetExtractor<List<Supplier>>(){
            public List<Supplier> extractData(ResultSet rs) throws SQLException,
                    DataAccessException {

                List<Supplier> list=new ArrayList<Supplier>();
                while(rs.next()){
                    Supplier e= new Supplier();
                    e.setId(rs.getInt(1));
                    e.setName(rs.getString(2));
                    list.add(e);
                }
                return list;
            }
        });
    }
}