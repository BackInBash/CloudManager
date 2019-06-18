/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.api.jetty.get;

import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author hax0r
 */
@Path("/config")
public class config {

    Gson gson = new Gson();

    @GET
    @Path("/cloudinit/{param}")
    @Produces(MediaType.TEXT_PLAIN)
    public String cloudinit(@PathParam("param") String name) {
        de.markus.cloudmanager.shared.db.get db = new de.markus.cloudmanager.shared.db.get();
        de.markus.cloudmanager.shared.cloudinit.decode d = new de.markus.cloudmanager.shared.cloudinit.decode();
        try {
            return d.base64(db.cloudinit(name));
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
