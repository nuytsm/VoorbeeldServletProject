package org.example;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;

public class ServletServer {
    private Server server;
    ServletHandler handler = new ServletHandler();

    public void start() throws Exception {
        server = new Server();
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8080);
        server.setConnectors(new Connector[] {connector});

        handler.addServletWithMapping(ArtistServlet.class, "/artist");

        server.setHandler(handler);
        server.start();
        server.join();
    }
}