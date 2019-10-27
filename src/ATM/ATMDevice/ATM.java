package ATM.ATMDevice;

import ATM.Interface.SwingInterface;

/**
 * Клас описывающий банкомат
 */

public class ATM {

    CardAcceptor cardAcceptor = null;
    Printer printer = null;
    Cassette cassette = null;
    Display display = null;
    Keyboard keyboard = null;
    SwingInterface swingInterface = null;

    private boolean statusWork = false;


    public ATM(CardAcceptor cardAcceptor, Printer printer, Cassette cassette, Display display, Keyboard keyboard ) {
        this.cardAcceptor = cardAcceptor;
        this.printer = printer;
        this.cassette = cassette;
        this.display = display;
        this.keyboard = keyboard;
    }

    public ATM(CardAcceptor cardAcceptor, Printer printer, Cassette cassette, Display display, Keyboard keyboard, SwingInterface swingInterface) {
        this.cardAcceptor = cardAcceptor;
        this.printer = printer;
        this.cassette = cassette;
        this.display = display;
        this.keyboard = keyboard;
        this.swingInterface = swingInterface;
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

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public boolean isStatusWork() {
        return statusWork;
    }

    public void setStatusWork(boolean statusWork) {
        this.statusWork = statusWork;
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
