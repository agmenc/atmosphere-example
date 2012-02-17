package org.pettswood;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import static ch.qos.logback.classic.Level.INFO;
import static org.pettswood.SystemConfiguration.retrieve;

public class App {
    private void start() throws Exception {Server server = new Server(8080);
        WebAppContext root = new WebAppContext();
        root.setWar("./src/main/webapp");
        root.setContextPath("/");
        server.setHandler(root);
        server.start();
    }

    public static void main(String[] args) throws Exception {
        retrieve().logLevel(INFO);
        new App().start();
    }
}
