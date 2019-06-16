/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.shared.cloud.hetzner;

import me.tomsdevsn.hetznercloud.objects.response.ActionResponse;

/**
 *
 * @author markus
 */
public class delete extends api {

    public String byID(long id) {
        ActionResponse deleteServer = cloudAPI.deleteServer(id);
        return deleteServer.getAction().getStatus();
    }

}
