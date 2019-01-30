package au.id.ah.config;

import au.id.ah.sio.FileInClasspathToInputStream;

import java.io.IOException;
import java.util.Properties;

public class Configuration {
    public static Properties loadProperties(final String filename) throws IOException {
        return new PropertiesFromInputStream()
                .apply(new FileInClasspathToInputStream()
                .apply(filename));
    }
}
