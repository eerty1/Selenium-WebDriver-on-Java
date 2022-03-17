package bring_it_on.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDataReader {
    private static final Properties PROPERTIES = new Properties();

    public static String readProperties(String propertyName) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("src/test/resources/config.properties");
            PROPERTIES.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return PROPERTIES.getProperty(propertyName);
    }
}
