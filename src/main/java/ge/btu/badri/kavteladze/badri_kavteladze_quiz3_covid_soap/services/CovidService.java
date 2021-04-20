package ge.btu.badri.kavteladze.badri_kavteladze_quiz3_covid_soap.services;

import ge.btu.badri.kavteladze.badri_kavteladze_quiz3_covid_soap.models.Covid;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

@WebService
public class CovidService {

    private final List<Covid> covidStatsList = new ArrayList<>(Arrays.asList(
            new Covid("USA", 32476690, 581576, 25043490),
            new Covid("India", 15413979, 180990, 13138656),
            new Covid("Brazil", 13977756, 375034, 12460702),
            new Covid("France", 5296210, 101185, 4150846),
            new Covid("Russia", 4718859, 106304, 4343245)
    ));

    @WebMethod
    public List<Covid> getStatistic() {
        return covidStatsList;
    }

    @WebMethod
    public Covid CountryStatistic(String country) {
        for (Covid covidStat : covidStatsList) {
            if (covidStat.getCountry().equals(country)) {
                return covidStat;
            }
        }
        return null;
    }

    @WebMethod
    public int TotalConfirmed() {
        int totalConfirmed = 0;
        for (Covid covidStat : covidStatsList) {
            totalConfirmed += covidStat.getConfirmed();
        }
        return totalConfirmed;
    }

    @WebMethod
    public int TotalDeaths() {
        int totalDeaths = 0;
        for (Covid covidStat : covidStatsList) {
            totalDeaths += covidStat.getDeaths();
        }
        return totalDeaths;
    }

    @WebMethod
    public int TotalRecovered() {
        int totalRecovered = 0;
        for (Covid covidStat : covidStatsList) {
            totalRecovered += covidStat.getRecovered();
        }
        return totalRecovered;
    }

}