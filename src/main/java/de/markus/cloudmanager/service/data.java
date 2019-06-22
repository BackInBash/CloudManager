/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.service;

import de.markus.cloudmanager.shared.models.HostList;
import java.util.List;

/**
 *
 * @author markus
 */
public class data {

    // Saved Data
    private static List<String> CloudIPs;
    private static List<HostList> CloudNodeList;

    // Setter
    public static void setCloudIPs(List<String> ip) {
        CloudIPs = null;
        CloudIPs = ip;
    }

    public static void setCloudNode(List<HostList> vhost) {
        CloudNodeList = null;
        CloudNodeList = vhost;
    }

    // Getter
    public static List<String> CloudIPs() {
        return CloudIPs;
    }

    public static List<HostList> getCloudNodes() {
        return CloudNodeList;
    }
}
