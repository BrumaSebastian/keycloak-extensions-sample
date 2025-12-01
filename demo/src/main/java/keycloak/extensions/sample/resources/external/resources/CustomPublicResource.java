package keycloak.extensions.sample.resources.external.resources;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.keycloak.models.KeycloakSession;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import keycloak.extensions.sample.services.providers.CustomServiceProvider;

public class CustomPublicResource {
    private final KeycloakSession session;

    public CustomPublicResource(KeycloakSession session) {
        this.session = session;
    }

    @GET
    @Operation(summary = "Get sample info")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        return Response.ok("A simple public resource response for realm: " + session.getContext().getRealm().getName())
                .build();
    }

    @GET
    @Path("custom-service")
    @Operation(summary = "Use custom service")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomService() {
        CustomServiceProvider customService = session.getProvider(CustomServiceProvider.class);
        String result = customService.DoStuff();

        return Response.ok("Custom service returned: " + result)
                .build();
    }
}
