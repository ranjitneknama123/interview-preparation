package utilities;

import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

    private static Properties prop = new Properties();

    static {

        try {
            String env = System.getProperty("env");
            env = (env == null || env.isBlank()) ? "qa" : env;

            String filePath = env + "/" + env + ".properties";

            InputStream input = ReadProperties.class
                    .getClassLoader()
                    .getResourceAsStream(filePath);

            prop.load(input);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

}
