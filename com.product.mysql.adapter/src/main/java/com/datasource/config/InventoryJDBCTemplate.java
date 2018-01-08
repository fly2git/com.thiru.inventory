package com.datasource.config;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by thiruvengadanl on 10/12/17.
 */
public class InventoryJDBCTemplate extends JdbcTemplate {

    DriverManagerDataSource dataSource;

    public InventoryJDBCTemplate(){

        dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(DatabaseConfig.driverName);
        dataSource.setUrl(DatabaseConfig.dataSource);
        dataSource.setUsername(DatabaseConfig.username);
        dataSource.setPassword(DatabaseConfig.password);
        setDataSource(dataSource);
    }
}