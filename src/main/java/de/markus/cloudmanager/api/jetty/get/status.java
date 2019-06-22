/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.api.jetty.get;

import com.google.gson.Gson;
import com.rometools.rome.io.FeedException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.stream.XMLStreamException;

/**
 *
 * @author hax0r
 */
@Path("/status")
public class status {

    de.markus.cloudmanager.shared.cloud.hetzner.status stat
            = new de.markus.cloudmanager.shared.cloud.hetzner.status();
    Gson gson = new Gson();

    @GET
    @Path("/cloud")
    @Produces(MediaType.APPLICATION_JSON)
    public String status() {
        try {
            return gson.toJson(stat.parse());
        } catch (FeedException ex) {
            Logger.getLogger(status.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(status.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(status.class.getName()).log(Level.SEVERE, null, ex);
        } catch (XMLStreamException ex) {
            Logger.getLogger(status.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "failed";
    }
}
