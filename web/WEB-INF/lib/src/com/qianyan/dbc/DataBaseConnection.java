package com.qianyan.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016/11/4.
 */
public class DataBaseConnection {
    private static final String DBDRIVER = "com.mysql.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://localhost:3306/admin";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "admin";
    private Connection conn;
    public DataBaseConnection(){
        try {
            Class.forName(DBDRIVER);
            this.conn= DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     *
     * @return
     */
    public Connection getConnection(){
        return this.conn;
    }

    /**
     *
     */
    public void close(){
        if(this.conn!=null){
            try {
                this.conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
