package pro1;

import com.google.gson.Gson;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.*;
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