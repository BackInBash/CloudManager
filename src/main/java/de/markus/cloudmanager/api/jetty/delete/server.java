/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.api.jetty.delete;

import com.google.gson.Gson;
import de.markus.cloudmanager.shared.cloud.hetzner.delete;
import de.markus.cloudmanager.shared.cloud.hetzner.get;
import de.markus.cloudmanager.shared.models.APIError;
import de.markus.cloudmanager.shared.models.APIResult;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import me.tomsdevsn.hetznercloud.objects.general.Server;

/**
 *
 * @author hax0r
 */
@Path("/server")
public class server {

    delete srv = new delete();
    get find = new get();
    Gson gson = new Gson();

    @DELETE
    @Path("/byID/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public String byID(@PathParam("param") long id) {
        APIResult res = new APIResult();
        res.Action = "Delete Server";
        res.Result = srv.byID(id);
        return gson.toJson(res);
    }

    @DELETE
    @Path("/byName/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public String byName(@PathParam("param") String name) {
        List<Server> list = find.serverByName(name);
        if (list.size() > 1) {
            APIError err = new APIError();
            err.Error = "Cannot delete the Server " + name;
            err.Reason = "Multiple Servers with the same name found.";
            return gson.toJson(err);
        }
        APIResult res = new APIResult();
        res.Action = "Delete Server";
        res.Result = srv.byID(list.get(0).getId());
        return gson.toJson(res);
    }
}
