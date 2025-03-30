package pro1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Properties config = new Properties();
        config.load(new FileInputStream("app.config"));
        int yearFrom = Integer.parseInt(config.getProperty("yearFrom"));
        int yearTo = Integer.parseInt(config.getProperty("yearTo"));
        String room = config.getProperty("room");
        String term = config.getProperty("term");
    }
}