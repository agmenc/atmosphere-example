package org.atmosphere.samples.pubsub;

import org.atmosphere.cpr.Broadcaster;
import org.atmosphere.jersey.SuspendResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static org.pettswood.SystemConfiguration.retrieve;

@Path("/marketData/subscribe")
@Produces("text/plain;charset=UTF-8")
public class MarketDataSubscriber {

    @GET
    public SuspendResponse<String> subscribe() {
        Broadcaster topic = retrieve().marketDataChangeTopic();
        System.out.println("Subscribe = " + topic);
        System.out.println("Suspending for: " + topic);
        return new SuspendResponse.SuspendResponseBuilder<String>()
                .broadcaster(topic)
                .outputComments(true)
                .addListener(new EventsLogger())
                .build();
    }
}