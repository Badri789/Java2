package ge.btu.badri.kavteladze.currency.badri_kavteladze_quiz2_currency_api.controller;


import ge.btu.badri.kavteladze.currency.badri_kavteladze_quiz2_currency_api.model.Currency;
import ge.btu.badri.kavteladze.currency.badri_kavteladze_quiz2_currency_api.model.CurrencyDB;
import ge.btu.badri.kavteladze.currency.badri_kavteladze_quiz2_currency_api.model.ExchangeCurrency;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/currency-service")
public class CurrencyController {

    @GET
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Currency> getCurrencyRates() {
        return CurrencyDB.getCurrencies();
    }

    @POST
    @Path("/buy")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public double buyOtherCurrency(ExchangeCurrency exchangeCurrency) {
        for (Currency currency : CurrencyDB.getCurrencies()) {
            if (currency.getTitle().equals(exchangeCurrency.getTo())) {
                return exchangeCurrency.getAmount() / currency.getSell();
            }
        }
        return 0;
    }

    @POST
    @Path("/sell")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public double buyGel(ExchangeCurrency exchangeCurrency) {
        for (Currency currency : CurrencyDB.getCurrencies()) {
            if (currency.getTitle().equals(exchangeCurrency.getTo())) {
                return exchangeCurrency.getAmount() * currency.getBuy();
            }
        }
        return 0;
    }

}
