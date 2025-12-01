package keycloak.extensions.sample.services.spis;

import org.keycloak.provider.Provider;
import org.keycloak.provider.ProviderFactory;
import org.keycloak.provider.Spi;

import keycloak.extensions.sample.services.factories.CustomServiceProviderFactory;
import keycloak.extensions.sample.services.providers.CustomServiceProvider;

public class CustomServiceSpi implements Spi {

    @Override
    public String getName() {
        return "custom-demo-service";
    }

    @Override
    public Class<? extends Provider> getProviderClass() {
        return CustomServiceProvider.class;
    }

    @Override
    public Class<? extends ProviderFactory> getProviderFactoryClass() {
        return CustomServiceProviderFactory.class;
    }

    @Override
    public boolean isInternal() {
        return true;
    }

}
