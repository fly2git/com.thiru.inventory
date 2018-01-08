package com.datasource.config;

import javax.xml.validation.Schema;
import java.sql.*;

/**
 * Created by thiruvengadanl on 10/12/17.
 */
public class GetJDBCConnection {

    public static Connection getConnection() {

        Connection con = null;
        try {
            Class.forName(DatabaseConfig.driverName);
            con = DriverManager.getConnection(DatabaseConfig.dataSource,
                    DatabaseConfig.username,
                    DatabaseConfig.password);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}