package com.sfl.gestibud.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;

@Path("hello")
@Produces(MediaType.TEXT_PLAIN)
public class HelloEndpoint {
    @GET
    public Response testGbdgApi() {
        return Response.ok("WELCOME! This is financial home managment...").build();
    }
}
