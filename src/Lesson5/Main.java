package Lesson5;

import Lesson5.ATMDevice.ATM;
import Lesson5.ATMDevice.CardAcceptor;
import Lesson5.ATMDevice.Cassette;
import Lesson5.ATMDevice.Printer;
import Lesson5.Bills.Сurrencyy;

public class Main {

    public static void main(String[] args) {

        Сurrencyy currency = new Сurrencyy ("usd","100", "USD");

        Cassette cassette = new Cassette(currency,100, "Cassette1");
        Printer printer = new Printer("Printer1");
        CardAcceptor cardAcceptor = new CardAcceptor("CardAcceptor1");

        ATM atm = new ATM(cardAcceptor,printer, cassette);

        System.out.println(atm);

    }
}
