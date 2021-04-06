package ge.btu.badri.kavteladze.currency.badri_kavteladze_quiz2_currency_api.model;

public class ExchangeCurrency {

    private String to;
    private double amount;

    public ExchangeCurrency(String to, double amount) {
        this.to = to;
        this.amount = amount;
    }

    public ExchangeCurrency() {
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
