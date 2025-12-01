package keycloak.extensions.sample.resources.external.providers;

import org.keycloak.models.KeycloakSession;
import org.keycloak.services.resource.RealmResourceProvider;

import keycloak.extensions.sample.resources.external.resources.CustomPublicResource;

public class CustomPublicResourceProvider implements RealmResourceProvider {
    private final KeycloakSession session;

    public CustomPublicResourceProvider(KeycloakSession session) {
        this.session = session;
    }

    @Override
    public Object getResource() {
        return new CustomPublicResource(session);
    }

    @Override
    public void close() {
    }
}
