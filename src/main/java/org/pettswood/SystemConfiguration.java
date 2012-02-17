package org.pettswood;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.atmosphere.cpr.Broadcaster;
import org.atmosphere.cpr.BroadcasterFactory;
import org.slf4j.LoggerFactory;

public class SystemConfiguration {
    private static SystemConfiguration configuration = new SystemConfiguration();
    private SystemConfiguration() {}

    public static SystemConfiguration retrieve() {
        return configuration;
    }

    public void logLevel(Level level) {
        ((Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)).setLevel(level);
    }

    public Broadcaster marketDataChangeTopic() {
        return BroadcasterFactory.getDefault().lookup("marketDataChange", true);
    }
}