package dwsamplebase;

import io.dropwizard.bundles.assets.ConfiguredAssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by jjoergensen on 4/28/15.
 */
public class Application extends io.dropwizard.Application<Configuration> {
    @Override
    public String getName() {
        return "DropWizard Sample Base";
    }

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        bootstrap.addBundle(new ConfiguredAssetsBundle("/assets/", "/", "index.html"));
    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
        final HelloWorldResource resource = new HelloWorldResource();
        environment.jersey().register(resource);
    }

    public static void main(String[] args) throws Exception {
        new Application().run(args);
    }
}
