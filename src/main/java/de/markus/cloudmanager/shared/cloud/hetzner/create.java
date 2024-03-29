/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.shared.cloud.hetzner;

import me.tomsdevsn.hetznercloud.objects.general.Server;
import me.tomsdevsn.hetznercloud.objects.request.ServerRequest;
import me.tomsdevsn.hetznercloud.objects.response.ServerResponse;

/**
 *
 * @author markus
 */
public class create extends api {

    public Server servers(String name, String type, String dc, String os, String userData) throws Exception {
        ServerResponse responseServer = null;
        try {
            ServerRequest requestServer = ServerRequest.builder()
                    .name(name)
                    .serverType(type)
                    .location(dc)
                    .image(os)
                    .startAfterCreate(true)
                    .userData(userData)
                    //.sshKeys(Arrays.asList(2991L))
                    .build();

            responseServer = cloudAPI.createServer(requestServer);
            return responseServer.getServer();
            
        } catch (Exception e) {
            throw e;
        }
    }

}
