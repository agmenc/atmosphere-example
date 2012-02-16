package org.pettswood;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.LoggerFactory;

import static ch.qos.logback.classic.Level.*;

public class App {
    public App() throws Exception {
        Server server = new Server(8080);
        WebAppContext root = new WebAppContext();

        root.setWar("./src/main/webapp");
        root.setContextPath("/");

        server.setHandler(root);
        server.start();
    }

    public static void main(String[] args) throws Exception {
        logLevel(INFO);
        new App();
    }

    private static void logLevel(Level level) {
        Logger root = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        root.setLevel(level);
    }
}
