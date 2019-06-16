/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.config;

import com.google.gson.Gson;
import de.markus.cloudmanager.shared.models.Config;
import java.io.IOException;
import java.nio.file.*;

;

/**
 *
 * @author markus
 */
public class config {

    private static String APIKEY;
    private static String DEFAULT_CONFIG = "/Users/hax0r/Documents/Source/CloudManager/CloudManager.conf";
    private static String DB_IP;
    private static String DB_NAME;
    private static String DB_USER;
    private static String DB_PASSWORD;

    public static String getApiKey() {
        return APIKEY;
    }

    public static String getDBIP() {
        return DB_IP;
    }

    public static String getDBName() {
        return DB_NAME;
    }

    public static String getDBUser() {
        return DB_USER;
    }

    public static String getDBPassword() {
        return DB_PASSWORD;
    }

    /**
     * Read Configuration File
     */
    public static void UpdateConfig() {
        Gson gson = new Gson();
        String data = null;
        try {
            data = new String(Files.readAllBytes(Paths.get(DEFAULT_CONFIG)));
        } catch (IOException e) {
            System.out.println("Cannot open config file: " + e.getMessage());
            System.exit(1);
        }
        if (data == null) {
            System.out.println("ERROR: Config file is empty!");
            System.exit(1);
        }
        try {
            Config ConfigObject = gson.fromJson(data, Config.class);
            APIKEY = ConfigObject.APIKEY;
            //DB_IP = ConfigObject.DB_IP;
            //DB_NAME = ConfigObject.DB_NAME;
            //DB_USER = ConfigObject.DB_USER;
            //DB_PASSWORD = ConfigObject.DB_PASSWORD;
        } catch (Exception ex) {
            System.out.println("ERROR: "+ex.getMessage());
            System.exit(1);
        }
    }
}
