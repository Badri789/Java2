package ge.btu.badri.kavteladze.currency.badri_kavteladze_quiz2_currency_api.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CurrencyDB {

    private static final List<Currency> currencies = new ArrayList<>(Arrays.asList(
            new Currency("USD", 3.16, 3.2),
            new Currency("EUR", 3.425, 3.475),
            new Currency("GBP", 3.84, 3.94),
            new Currency("RUB", 4.12, 4.3),
            new Currency("TRY", 0.4, 0.47),
            new Currency("AZN", 1.6, 1.84)
    ));

    public CurrencyDB() {
    }

    public static List<Currency> getCurrencies() {
        return currencies;
    }

}
