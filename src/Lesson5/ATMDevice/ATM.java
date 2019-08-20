package Lesson5.ATMDevice;

import java.util.ArrayList;

/**
 * Клас описывающий банкомат
 */

public class ATM {

    CardAcceptor cardAcceptor = null;
    Printer printer = null;
    Cassette cassette = null;

    public ATM(CardAcceptor cardAcceptor, Printer printer, Cassette cassette) {
        this.cardAcceptor = cardAcceptor;
        System.out.println("Картоприемник добавлен в банкомат");
        this.printer = printer;
        System.out.println("Принтер добавлен в банкомат");
        this.cassette = cassette;
        System.out.println("Кассета добавлен в банкомат");
    }

    public CardAcceptor getCardAcceptor() {
        return cardAcceptor;
    }

    public void setCardAcceptor(CardAcceptor cardAcceptor) {
        this.cardAcceptor = cardAcceptor;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public Cassette getCassette() {
        return cassette;
    }

    public void setCassette(Cassette cassette) {
        this.cassette = cassette;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "cardAcceptor=" + cardAcceptor +
                ", printer=" + printer +
                ", cassette=" + cassette +
                '}';
    }
}
