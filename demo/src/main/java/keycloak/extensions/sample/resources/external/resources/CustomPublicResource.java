package keycloak.extensions.sample.resources.external.resources;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.keycloak.models.KeycloakSession;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class CustomPublicResource {
    private final KeycloakSession session;

    public CustomPublicResource(KeycloakSession session) {
        this.session = session;
    }

    @GET
    @Operation(summary = "Get sample info")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGroups() {
        return Response.ok("A simple public resource response for realm: " + session.getContext().getRealm().getName())
                .build();
    }
}
