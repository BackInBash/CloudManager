/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.shared.db;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author markus
 */
public class delete extends config {
    
        public void server(long id, String ip, String name, String tag) {
        open();
        PreparedStatement stm = null;

        try {
            stm = SQL.prepareStatement("DELETE FROM Server WHERE ID = ?");

            stm.setLong(1, id);

            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(add.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void ssh(String pub) {
        open();
        PreparedStatement stm = null;

        try {
            stm = SQL.prepareStatement("DELETE FROM SSH WHERE PrivateKey = ?");

            stm.setString(1, pub);

            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(add.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }
        
    public void cloudinit(String name) {
        open();
        PreparedStatement stm = null;

        try {
            stm = SQL.prepareStatement("DELETE FROM CloudInit WHERE Name = ?");

            stm.setString(1, name);

            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(add.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }
}
