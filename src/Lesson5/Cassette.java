package Lesson5;


public class Cassette {

    int countCurrency = 0;
    Сurrencyy currency = null;

    public Cassette(int countCurrency, Сurrencyy currency) {
        this.countCurrency = countCurrency;
        this.currency = currency;
    }

    public int getCountCurrency() {
        return countCurrency;
    }

    public void setCountCurrency(int countCurrency) {
        this.countCurrency = countCurrency;
    }

    public Сurrencyy getCurrency() {
        return currency;
    }

    public void setCurrency(Сurrencyy currency) {
        this.currency = currency;
    }
}
