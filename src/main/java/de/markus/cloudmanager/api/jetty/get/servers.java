/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.api.jetty.get;

import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import de.markus.cloudmanager.shared.cloud.hetzner.get;
import javax.ws.rs.PathParam;

/**
 *
 * @author markus
 */
@Path("/servers")
public class servers {

    get srv = new get();
    Gson gson = new Gson();

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public String all() {
        return gson.toJson(srv.allServers());
    }

    @GET
    @Path("/byID/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public String byID(@PathParam("param") int id) {
        return gson.toJson(srv.serverByID(id));
    }

    @GET
    @Path("/byName/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public String byName(@PathParam("param") String name) {
        return gson.toJson(srv.serverByName(name));
    }
    
    @GET
    @Path("/type/all")
    @Produces(MediaType.APPLICATION_JSON)
    public String ServerTypes(){
        return gson.toJson(srv.serverTypes());
    }
    
    @GET
    @Path("/type/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public String ServerTypebyName(@PathParam("param") String name) {
        return gson.toJson(srv.serverTypebyName(name));
    }
}
