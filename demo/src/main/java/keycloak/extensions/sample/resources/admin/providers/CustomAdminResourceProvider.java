package keycloak.extensions.sample.resources.admin.providers;

import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.services.resources.admin.AdminEventBuilder;
import org.keycloak.services.resources.admin.ext.AdminRealmResourceProvider;
import org.keycloak.services.resources.admin.fgap.AdminPermissionEvaluator;

import keycloak.extensions.sample.resources.admin.resources.CustomAdminResource;

public class CustomAdminResourceProvider implements AdminRealmResourceProvider {
    @Override
    public Object getResource(KeycloakSession session, RealmModel realm, AdminPermissionEvaluator auth,
            AdminEventBuilder adminEvent) {
        return new CustomAdminResource(session, realm, auth, adminEvent);
    }

    @Override
    public void close() {
    }
}
