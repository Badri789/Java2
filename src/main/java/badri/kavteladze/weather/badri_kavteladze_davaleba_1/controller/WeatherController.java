package badri.kavteladze.weather.badri_kavteladze_davaleba_1.controller;

import badri.kavteladze.weather.badri_kavteladze_davaleba_1.model.DirectionType;
import badri.kavteladze.weather.badri_kavteladze_davaleba_1.model.Weather;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Path("/weather")
public class WeatherController {

    private final List<Weather> prognosis = new ArrayList<>(Arrays.asList(
            new Weather("Tbilisi", 20, 15, 70, DirectionType.EAST, 26),
            new Weather("Batumi", 25, 11, 72, DirectionType.WEST, 19),
            new Weather("Kutaisi", 22, 12, 71, DirectionType.EAST, 35),
            new Weather("Gori", 23, 14, 69, DirectionType.SOUTH, 29),
            new Weather("Telavi", 25, 16, 72, DirectionType.NORTH, 20)
    ));

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> getWholePrognosis() {
        return prognosis;
    }

    @GET
    @Path("/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getCityWeather(@PathParam("city") String city) {
        for (Weather weather : prognosis) {
            if (weather.getCityName().equalsIgnoreCase(city)) {
                return weather;
            }
        }
        return null;
    }

}

