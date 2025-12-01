package keycloak.extensions.sample.services.providers;

import org.keycloak.provider.Provider;

public interface CustomServiceProvider extends Provider {
    public String DoStuff();
}
