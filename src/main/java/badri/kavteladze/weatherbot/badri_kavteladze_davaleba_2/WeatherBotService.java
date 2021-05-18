package badri.kavteladze.weatherbot.badri_kavteladze_davaleba_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherBotService {
    public static String answer(String text) throws Exception {
        String result;

        if (text.equals("all")) {
            result = getPrognosis("");
        } else {
            result = getPrognosis(text);
        }

        return result;
    }

    public static String getPrognosis(String city) throws Exception {
        URL url = new URL(String.format("http://localhost:8080/api/weather/%s", city));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        String output;
        StringBuilder res = new StringBuilder(" ");
        System.out.println("Output from Server :  \n");
        while ((output = br.readLine()) != null) {
            res.append(output);
        }
        conn.disconnect();
        return res.toString();
    }
}
