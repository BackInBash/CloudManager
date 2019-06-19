/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.api.jetty.get;

import com.google.gson.Gson;
import de.markus.cloudmanager.shared.cloud.hetzner.get;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author hax0r
 */
@Path("/datacenter")
public class datacenter {

    get srv = new get();
    Gson gson = new Gson();

    @GET
    @Path("/location")
    @Produces(MediaType.APPLICATION_JSON)
    public String alldc() {
        return gson.toJson(srv.allDC());
    }
    
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public String alldcs() {
        return gson.toJson(srv.allDCs());
    }
    
    @GET
    @Path("/byID/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public String dcbyID(@PathParam("param") int id) {
        return gson.toJson(srv.DCByID(id));
    }
    
}