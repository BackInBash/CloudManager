/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.api.jetty.post;

import com.google.gson.Gson;
import de.markus.cloudmanager.shared.models.APICreateCloudInit;
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
        de.markus.cloudmanager.shared.db.get dbs = new de.markus.cloudmanager.shared.db.get();
        APIResult res = new APIResult();
        de.markus.cloudmanager.shared.cloudinit.decode d = new de.markus.cloudmanager.shared.cloudinit.decode();

        res.Action = "Create Server";
        try {
            APICreateServer srv = gson.fromJson(jsonRequest, APICreateServer.class);

            String CloudInit = d.base64(dbs.cloudinit(srv.UserData));

            Server created = null;
            try {
                created = srvrequest.servers(srv.Name, srv.Type, srv.DC, srv.OS, CloudInit);
                db.server(created.getId(), created.getName(), created.getPublicNet().getIpv4().getIp(), srv.Tag);
            } catch (Exception ex) {
                res.Result = "Status: " + created.getStatus() + " Message: " + ex.getMessage();
                return gson.toJson(res);
            }

            res.Result = created.getStatus();
        } catch (Exception e) {
            res.Result = e.getMessage();
        }
        return gson.toJson(res);
    }

    @POST
    @Path("/cloudinit")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String cloudinit(String jsonRequest) {
        de.markus.cloudmanager.shared.db.add db = new de.markus.cloudmanager.shared.db.add();
        APICreateCloudInit conf = gson.fromJson(jsonRequest, APICreateCloudInit.class);
        APIResult res = new APIResult();
        res.Action = "Create CloudInit";

        try {
            db.cloudinit(conf.Name, conf.Payload);
        } catch (Exception ex) {
            res.Result = "Status: " + ex.getMessage();
            return gson.toJson(res);
        }

        res.Result = "Status: success";

        return gson.toJson(res);
    }

}
