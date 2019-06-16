/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.service.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author hax0r
 */
public class ip implements Job {

    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {
        de.markus.cloudmanager.shared.cloud.hetzner.get ip = new de.markus.cloudmanager.shared.cloud.hetzner.get();
        de.markus.cloudmanager.service.data.setCloudIPs(ip.getIPs());
    }
}
