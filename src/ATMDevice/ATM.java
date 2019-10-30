package ATMDevice;

import Interface.SwingInterface;

import java.util.Objects;

/**
 * Class describes structure ATM field class is device ATM
 */

public class ATM {
    /**
     * link object CardAcceptor
     *
     * @see CardAcceptor
     */
    private CardAcceptor cardAcceptor = null;
    /**
     * link object Printer
     *
     * @see Printer
     */
    private Printer printer = null;
    /**
     * link object Cassette
     *
     * @see Cassette
     */
    private Cassette cassette = null;
    /**
     * link object Display
     *
     * @see Display
     */
    private Display display = null;
    /**
     * link object Keyboard
     *
     * @see Keyboard
     */
    private Keyboard keyboard = null;
    /**
     * link object SwingInterface
     *
     * @see SwingInterface
     */
    private SwingInterface swingInterface = null;

    /**
     * Constructor ATM for console using, constructor dont have object class SwingInterface
     *
     * @param cardAcceptor device ATM cardacceptor
     * @param printer      device ATM printer
     * @param cassette     device ATM cassette
     * @param display      device ATM display
     * @param keyboard     device ATM keyboard
     */
    public ATM(CardAcceptor cardAcceptor, Printer printer, Cassette cassette, Display display, Keyboard keyboard) {
        this.cardAcceptor = cardAcceptor;
        this.printer = printer;
        this.cassette = cassette;
        this.display = display;
        this.keyboard = keyboard;
    }

    /**
     * Constructor ATM for swing interface constructor  have object class SwingInterface
     *
     * @param cardAcceptor   device ATM cardacceptor
     * @param printer        device ATM printer
     * @param cassette       device ATM cassette
     * @param display        device ATM display
     * @param keyboard       device ATM keyboard
     * @param swingInterface interface for library swing
     */
    public ATM(CardAcceptor cardAcceptor, Printer printer, Cassette cassette, Display display, Keyboard keyboard, SwingInterface swingInterface) {
        this.cardAcceptor = cardAcceptor;
        this.printer = printer;
        this.cassette = cassette;
        this.display = display;
        this.keyboard = keyboard;
        this.swingInterface = swingInterface;
    }

    /**
     * Standart getter field CardAcceptor
     * @return link his object CardAcceptor
     */
    public CardAcceptor getCardAcceptor() {
        return cardAcceptor;
    }

    /**
     * Standart setter field cardAcceptor
     * @param cardAcceptor link his object CardAcceptor
     */
    public void setCardAcceptor(CardAcceptor cardAcceptor) {
        this.cardAcceptor = cardAcceptor;
    }

    /**
     *Standart getter field printer
     * @return link his object Printer
     */
    public Printer getPrinter() {
        return printer;
    }

    /**
     * Standart setter field printer
     * @param printer link his object Printer
     */
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    /**
     * Standart getter field cassette
     * @return link his object Cassette
     */
    public Cassette getCassette() {
        return cassette;
    }

    /**
     * Standart setter param cassette
     * @param cassette link his object Cassette
     */
    public void setCassette(Cassette cassette) {
        this.cassette = cassette;
    }

    /**
     * Standart getter param display
     * @return link his object Display
     */
    public Display getDisplay() {
        return display;
    }
    /**
     * Standart setter param display
     * @param display  link his object Display
     */
    public void setDisplay(Display display) {
        this.display = display;
    }

    /**
     * Standart getter param display
     * @return link his object Keyboard
     */
    public Keyboard getKeyboard() {
        return keyboard;
    }

    /**
     * Standart setter param display
     * @param keyboard link his object Keyboard
     */
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    /**
     * Standart method equals
     * @param o some object
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ATM)) return false;
        ATM atm = (ATM) o;
        return Objects.equals(getCardAcceptor(), atm.getCardAcceptor()) &&
                Objects.equals(getPrinter(), atm.getPrinter()) &&
                Objects.equals(getCassette(), atm.getCassette()) &&
                Objects.equals(getDisplay(), atm.getDisplay()) &&
                Objects.equals(getKeyboard(), atm.getKeyboard()) &&
                Objects.equals(swingInterface, atm.swingInterface);
    }

    /**
     * Standart method hashCode
     * @return Objects.hash(getCardAcceptor(), getPrinter(), getCassette(), getDisplay(), getKeyboard(), swingInterface)
     */
    @Override
    public int hashCode() {
        return Objects.hash(getCardAcceptor(), getPrinter(), getCassette(), getDisplay(), getKeyboard(), swingInterface);
    }

    /**
     * Standart method String
     * @return
     */
    @Override
    public String toString() {
        return "ATM{" +
                "cardAcceptor=" + cardAcceptor +
                ", printer=" + printer +
                ", cassette=" + cassette +
                ", display=" + display +
                ", keyboard=" + keyboard +
                ", swingInterface=" + swingInterface +
                '}';
    }
}
