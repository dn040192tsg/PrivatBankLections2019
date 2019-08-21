package Lesson5;

import Lesson5.ATMDevice.ATM;
import Lesson5.ATMDevice.CardAcceptor;
import Lesson5.ATMDevice.Cassette;
import Lesson5.ATMDevice.Printer;
import Lesson5.Currencys.Currencyy;
import Lesson5.Currencys.USD;


public class Main {

    public static void main(String[] args) {

        Currencyy currency = new USD("Dollar","100", "USD");
        Cassette cassette = new Cassette(currency,100, "Cassette1");
        Printer printer = new Printer("Printer1");
        CardAcceptor cardAcceptor = new CardAcceptor("CardAcceptor1");

        ATM atm = new ATM(cardAcceptor,printer, cassette);

        System.out.println(atm);
        System.out.println(cassette.getCurrencyList());

    }
}
