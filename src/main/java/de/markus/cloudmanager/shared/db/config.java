/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.shared.db;

/**
 *
 * @author hax0r
 */
import java.sql.*;
import java.util.logging.Level;

public class config {

    protected Connection SQL;

    protected void open() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(de.markus.cloudmanager.shared.db.config.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = null;

        try {
            SQL = DriverManager.getConnection("jdbc:mysql://" + de.markus.cloudmanager.config.config.getDBIP() + ":3306/" + de.markus.cloudmanager.config.config.getDBName()+"?serverTimezone=EST5EDT", de.markus.cloudmanager.config.config.getDBUser(), de.markus.cloudmanager.config.config.getDBPassword());
            //SQL = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
            conn = SQL;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            if (SQL != null) {
                try {
                    SQL.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    protected void close() {
        if (SQL != null) {
            try {
                SQL.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
