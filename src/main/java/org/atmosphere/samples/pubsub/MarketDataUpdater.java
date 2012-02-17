package org.atmosphere.samples.pubsub;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static org.pettswood.SystemConfiguration.retrieve;

@Path("/marketData/update")
@Produces("text/plain;charset=UTF-8")
public class MarketDataUpdater {

    @POST
    public void update(@FormParam("message") String message) {
        retrieve().marketDataChangeTopic().broadcast(message);
    }
}
