package keycloak.extensions.sample.resources.admin.factories;

import org.keycloak.Config.Scope;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.services.resources.admin.ext.AdminRealmResourceProvider;
import org.keycloak.services.resources.admin.ext.AdminRealmResourceProviderFactory;

import keycloak.extensions.sample.resources.admin.providers.CustomAdminResourceProvider;

public class CustomAdminResourceProviderFactory implements AdminRealmResourceProviderFactory {
    public static final String ID = "custom-admin-extension";

    @Override
    public void close() {

    }

    @Override
    public AdminRealmResourceProvider create(KeycloakSession session) {
        return new CustomAdminResourceProvider();
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
