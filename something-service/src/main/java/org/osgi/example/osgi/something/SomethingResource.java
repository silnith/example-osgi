package org.osgi.example.osgi.something;

import java.util.ArrayList;
import java.util.Collection;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

/**
 * A JAX-RS resource to do something.
 */
@JaxrsResource
@Path("something")
public class SomethingResource {
    
    /**
     * Returns all somethings.
     * 
     * @return all somethings
     */
    @GET
    @NotNull
    public Response getSomething() {
        final Something something = new Something();
        something.identifier = "something";
        
        final Collection<Something> somethings = new ArrayList<>();
        somethings.add(something);
        
        return Response.ok(somethings).build();
    }
    
    /**
     * Returns one something.
     * 
     * @param identifier the identifier for the something
     * @return the something
     */
    @GET
    @Path("{identifier}")
    @NotNull
    public Response getSomething(@PathParam("identifier") @NotNull final String identifier) {
        final Something something = new Something();
        something.identifier = identifier;
        
        return Response.ok(something).build();
    }
    
}
