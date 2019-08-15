package Lesson5;

import java.util.ArrayList;

public class ATM {
    CardAcceptor cardAcceptor = null;
    Printer printer = null;
    ArrayList <Cassette> listCassette = null;


    public ATM(CardAcceptor cardAcceptor, Printer printer) {
        this.cardAcceptor = cardAcceptor;
        this.printer = printer;
    }


    public void addCassette (Cassette cassette){
        listCassette.add(cassette);
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

    public ArrayList<Cassette> getListCassette() {
        return listCassette;
    }

    public void setListCassette(ArrayList<Cassette> listCassette) {
        this.listCassette = listCassette;
    }
}
