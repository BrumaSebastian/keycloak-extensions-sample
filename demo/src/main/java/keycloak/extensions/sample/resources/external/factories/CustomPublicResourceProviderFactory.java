package keycloak.extensions.sample.resources.external.factories;

import org.keycloak.Config.Scope;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.services.resource.RealmResourceProvider;
import org.keycloak.services.resource.RealmResourceProviderFactory;

import keycloak.extensions.sample.resources.external.providers.CustomPublicResourceProvider;

public class CustomPublicResourceProviderFactory implements RealmResourceProviderFactory {
    public static final String ID = "custom-public-extension";

    @Override
    public void close() {
    }

    @Override
    public RealmResourceProvider create(KeycloakSession session) {
        return new CustomPublicResourceProvider(session);
    }

    @Override
    public String getId() {
        return ID;
    }

    @Override
    public void init(Scope arg0) {
    }

    @Override
    public void postInit(KeycloakSessionFactory arg0) {
    }
}
