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
public class add extends config {

    public void server(long id, String ip, String name, String tag) {
        open();
        PreparedStatement stm = null;

        try {
            stm = SQL.prepareStatement("INSERT INTO Server(ID, IP, Name, Tag) VALUES (?, ?, ?, ?)");

            stm.setLong(1, id);
            stm.setString(2, ip);
            stm.setString(3, name);
            stm.setString(4, tag);

            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(add.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void ssh(long id, String pub, String priv) {
        open();
        PreparedStatement stm = null;

        try {
            stm = SQL.prepareStatement("INSERT INTO SSH(ServerID, PublicKey, PrivateKey) VALUES (?, ?, ?)");

            stm.setLong(1, id);
            stm.setString(2, pub);
            stm.setString(3, priv);

            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(add.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }
    
    public void cloudinit(String name, String payload) {
        open();
        PreparedStatement stm = null;

        try {
            stm = SQL.prepareStatement("INSERT INTO CloudInit(Name, Payload) VALUES (?, ?)");

            stm.setString(1, name);
            stm.setString(2, payload);

            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(add.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }
    
}
