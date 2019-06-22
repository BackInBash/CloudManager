/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.shared.monitor;

import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hax0r
 */
public class network {

    private final String os = System.getProperty("os.name").toLowerCase();

    private String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

    public String traceRoute(InetAddress address) {
        String route = "";
        try {
            Process traceRt;
            if (os.contains("win")) {
                traceRt = Runtime.getRuntime().exec("tracert " + address.getHostAddress());
            } else {
                traceRt = Runtime.getRuntime().exec("traceroute " + address.getHostAddress());
            }

            // read the output from the command
            route = convertStreamToString(traceRt.getInputStream());

            // read any errors from the attempted command
            String errors = convertStreamToString(traceRt.getErrorStream());
            if (errors != "") {
                Logger.getLogger(network.class.getName()).log(Level.SEVERE, null, "ERROR");
            }
        } catch (IOException e) {
            Logger.getLogger(network.class.getName()).log(Level.SEVERE, null, e);
        }

        return route;
    }
}
