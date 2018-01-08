package com.datasource.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by thiruvengadanl on 09/12/17.
 */

//@Configuration
//@PropertySource(value = "classpath:application.properties")
public class DatabaseConfig {

    //@Value("${spring.datasource.username}")
    public static final String driverName ="com.mysql.jdbc.Driver";

   // @Value("${spring.datasource.url}")
    public static final String dataSource = "jdbc:mysql://localhost:3306/inventory";

    //@Value("${spring.datasource.username}")
    public static final String username="root";

    //@Value("${spring.datasource.password}")
    public static final String password="thiru123";

    public static void main(String[] args)  {
        System.out.println(password);
    }
}