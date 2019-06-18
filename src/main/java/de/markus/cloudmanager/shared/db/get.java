/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.shared.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author markus
 */
public class get extends config {
    
    public String cloudinit(String name) {
        open();
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            stm = SQL.prepareStatement("SELECT * FROM CloudInit WHERE Name = ? ORDER BY ID DESC");
            stm.setString(1, name);
            rs = stm.executeQuery();
            rs.next();
            return rs.getString("Payload");

        } catch (SQLException ex) {
            Logger.getLogger(add.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return null;
    }
}
