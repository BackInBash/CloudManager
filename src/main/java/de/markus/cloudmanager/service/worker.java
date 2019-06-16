/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.service;

import de.markus.cloudmanager.service.jobs.*;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author markus
 */
public class worker {

    public void schedule() throws SchedulerException {

        JobDetail[] Job = new JobDetail[2];
        Trigger[] Trigger = new Trigger[2];

        Job[0] = JobBuilder.newJob(ip.class).withIdentity("IP", "group1").build();

        Trigger[0] = TriggerBuilder
                .newTrigger()
                .withIdentity("IPTrigger", "group1")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(10).repeatForever())
                .build();

        Job[1] = JobBuilder.newJob(config.class).withIdentity("Config", "group2").build();

        Trigger[1] = TriggerBuilder
                .newTrigger()
                .withIdentity("ConfigTrigger", "group2")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(10).repeatForever())
                .build();

        for (int i = 0; i < Job.length; i++) {
            Scheduler scheduler = new StdSchedulerFactory().getScheduler();
            scheduler.start();
            scheduler.scheduleJob(Job[i], Trigger[i]);
        }
    }
}
