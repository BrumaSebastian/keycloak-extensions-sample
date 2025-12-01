package keycloak.extensions.sample.services.providers;

public class DefaultCustomServiceProvider implements CustomServiceProvider {

    @Override
    public void close() {
    }

    @Override
    public String DoStuff() {
        return "This is a demo";
    }
}
