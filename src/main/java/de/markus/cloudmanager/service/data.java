/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.service;

import java.util.List;

/**
 *
 * @author markus
 */
public class data {

    // Saved Data
    private static List<String> CloudIPs;

    // Setter
    public static void setCloudIPs(List<String> ip) {
        CloudIPs = null;
        CloudIPs = ip;
    }

    // Getter
    public static List<String> CloudIPs() {
        return CloudIPs;
    }
}
