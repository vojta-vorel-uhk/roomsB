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

        for(int i =2014; i <=2022;i++) {
            HttpClient client = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://stag-demo.uhk.cz/ws/services/rest2/rozvrhy/getRozvrhByMistnost?semestr=ZS&rok=" + i + "&budova=J&mistnost=J22&outputFormat=json"))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            Gson gson = new Gson();
            RoomSchedule rozvrhUcebny = gson.fromJson(body, RoomSchedule.class);
            int sum=0;
            for(var a : rozvrhUcebny.getActions())
            {
                sum+=a.obsazeni;
            }
            System.out.println("J22, rok " +i+" : "+sum+" osob");
        }
    }
}