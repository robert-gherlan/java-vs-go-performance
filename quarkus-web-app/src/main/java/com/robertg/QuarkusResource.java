package com.robertg;

import io.smallrye.common.annotation.RunOnVirtualThread;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.ResponseStatus;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class QuarkusResource {

    @GET
    @Path("/load")
    @RunOnVirtualThread
    public String loadTest() throws InterruptedException {
        Thread.sleep(1000);
        return "";
    }

    @GET
    @Path("/thread/name")
    @RunOnVirtualThread
    public String threadName() {
        return Thread.currentThread().getName();
    }
}