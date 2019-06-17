/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.api.jetty.post;

import com.google.gson.Gson;
import de.markus.cloudmanager.shared.models.APICreateServer;
import de.markus.cloudmanager.shared.models.APIResult;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import me.tomsdevsn.hetznercloud.objects.general.Server;

/**
 *
 * @author hax0r
 */
@Path("/create")
public class create {
    
    Gson gson = new Gson();
    
    @POST
    @Path("/server")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String server(String jsonRequest) {
        de.markus.cloudmanager.shared.cloud.hetzner.create srvrequest = new de.markus.cloudmanager.shared.cloud.hetzner.create();
        de.markus.cloudmanager.shared.db.add db = new de.markus.cloudmanager.shared.db.add();
        APICreateServer srv = gson.fromJson(jsonRequest, APICreateServer.class);
        
        Server created = srvrequest.servers(srv.Name, srv.Type, srv.DC, srv.OS);
        db.server(created.getId(), created.getName(), created.getPublicNet().getIpv4().getIp() ,srv.Tag);
        
        
        
        APIResult res = new APIResult();
        res.Action = "Create Server";
        res.Result = created.getStatus();
        
        return gson.toJson(res);
    }
}
