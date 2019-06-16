/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.shared.cloud.hetzner;

import me.tomsdevsn.hetznercloud.HetznerCloudAPI;

/**
 *
 * @author markus
 */
public class api {

    protected HetznerCloudAPI cloudAPI = new HetznerCloudAPI(de.markus.cloudmanager.config.config.getApiKey());

}
