package keycloak.extensions.sample.resources.admin.resources;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.services.resources.admin.AdminEventBuilder;
import org.keycloak.services.resources.admin.fgap.AdminPermissionEvaluator;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class CustomAdminResource {
    private final AdminPermissionEvaluator auth;
    private final AdminEventBuilder adminEvent;
    private final KeycloakSession session;
    private final RealmModel realm;

    public CustomAdminResource(KeycloakSession session, RealmModel realm, AdminPermissionEvaluator auth,
            AdminEventBuilder adminEvent) {
        this.auth = auth;
        this.adminEvent = adminEvent;
        this.session = session;
        this.realm = realm;
    }

    @GET
    @Path("info")
    @Operation(summary = "Get sample info")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        return Response.ok("A simple resource response for realm: " + realm.getName()).build();
    }
}
