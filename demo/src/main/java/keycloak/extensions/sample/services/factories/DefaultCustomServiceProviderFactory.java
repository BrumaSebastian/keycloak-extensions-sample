package keycloak.extensions.sample.services.factories;

import org.keycloak.Config.Scope;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

import keycloak.extensions.sample.services.providers.CustomServiceProvider;
import keycloak.extensions.sample.services.providers.DefaultCustomServiceProvider;

public class DefaultCustomServiceProviderFactory implements CustomServiceProviderFactory {
    public static final String ID = "custom-demo-service-extension";

    @Override
    public void close() {
    }

    @Override
    public CustomServiceProvider create(KeycloakSession arg0) {
        return new DefaultCustomServiceProvider();
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
