package org.pettswood;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class App {
    public App() throws Exception {
        Server server = new Server(8080);
        WebAppContext root = new WebAppContext();

        root.setWar("./lib/temp/");
//        root.setWar("./src/main/webapp");
        root.setContextPath("/");

        server.setHandler(root);
        server.start();
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}
