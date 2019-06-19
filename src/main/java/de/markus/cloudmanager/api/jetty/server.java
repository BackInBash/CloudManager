/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.markus.cloudmanager.api.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;
import static org.eclipse.jetty.servlet.ServletContextHandler.NO_SESSIONS;

/**
 *
 * @author markus
 */
public class server {

    public static void startup() {
        Server server = new Server(8080);

        ServletContextHandler servletContextHandler = new ServletContextHandler(NO_SESSIONS);

        servletContextHandler.setContextPath("/");
        server.setHandler(servletContextHandler);

        ServletHolder servletHolder = servletContextHandler.addServlet(ServletContainer.class, "/api/*");
        servletHolder.setInitOrder(0);
        servletHolder.setInitParameter(
                "jersey.config.server.provider.packages",
                "de.markus.cloudmanager.api"
        );
        servletHolder.setAsyncSupported(true);

        try {
            server.start();
            server.join();
        } catch (Exception ex) {
            System.out.println("Error occurred while starting Jetty" + ex.getMessage());
            System.exit(1);
        } finally {
            server.destroy();
        }
    }
}
