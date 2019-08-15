package Lesson5;


public class Main {

    public static void main(String[] args) {

        Сurrencyy currency = new Сurrencyy ("usd","100", "USD");
        Cassette cassette = new Cassette(100,currency);
        Printer printer = new Printer("Printer");
        CardAcceptor cardAcceptor = new CardAcceptor("CardAcceptor");
        ATM atm = new ATM(cardAcceptor,printer);
        atm.addCassette(cassette);

    }
}
