package au.id.ah.config;

import au.id.ah.efunc.Function;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Anthony on 18/05/2015.
 */
public class PropertiesFromInputStream implements Function<InputStream, Properties, IOException> {
    @Override
    public Properties apply(InputStream inputStream) throws IOException{
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties;
    }
}
