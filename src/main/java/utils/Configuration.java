package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
    public static String getConfVal(String key) {

        Properties property = new Properties();

        try {
            FileInputStream conf = new FileInputStream("src/test/resources/test.properties");
            property.load(conf);

        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
        return property.getProperty(key);
    }

    public static String getLogVal(String key) {

        Properties property = new Properties();

        try {
            FileInputStream conf = new FileInputStream("src/test/resources/login.properties");
            property.load(conf);

        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
        return property.getProperty(key);
    }
}
