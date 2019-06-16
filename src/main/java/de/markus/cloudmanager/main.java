/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager;

import java.util.logging.Level;
import java.util.logging.Logger;
import me.tomsdevsn.hetznercloud.objects.general.Server;
import org.quartz.SchedulerException;

/**
 *
 * @author markus
 */
public class main {

    public static void main(String[] args) {
        // Read Config
        de.markus.cloudmanager.config.config.UpdateConfig();
        // Start Service Worker
        de.markus.cloudmanager.service.worker svc = new de.markus.cloudmanager.service.worker();
        try {
            svc.schedule();
        } catch (SchedulerException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Start Jetty
        de.markus.cloudmanager.api.jetty.server.startup();
    }
}
