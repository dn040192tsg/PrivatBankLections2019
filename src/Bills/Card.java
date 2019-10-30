package Bills;

import Currencys.CurrencyEnum.CurencyAbrEnum;

import java.io.Serializable;
import java.util.Objects;

/**
 * Abstract class description param and method card
 */

public abstract class Card implements Serializable {
    /**
     * number card only 16 number
     */
    private String cardNumber;
    /**
     * pin code only 4 numbers
     */
    private PinCode pin;
    /**
     * validity format month+year example 1219
     */
    private String validity;
    /**
     * balance card
     */
    private double balance;
    /**
     * CVV code only 3 number
     */
    private String CVV;
    /**
     * Enum UAH or USD
     */
    private CurencyAbrEnum curency;
    /**
     * param for serialization
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor
     * @param cardNumber
     * @param pin
     * @param validity
     * @param balance
     * @param CVV
     * @param curency
     */
    public Card(String cardNumber, PinCode pin, String validity, int balance, String CVV, CurencyAbrEnum curency) {
        setCardNumber(cardNumber);
        setPin(pin);
        setValidity(validity);
        setBalance(balance);
        setCVV(CVV);
        this.curency = curency;

    }

    /**
     * Return card number
     * @return card number
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Chekkin card number regular "\\d{16}" and set new card number
     * @param cardNumber
     * @throws IllegalArgumentException
     */
    private void setCardNumber(String cardNumber) throws IllegalArgumentException {

        if (cardNumber.matches("\\d{16}")){
            this.cardNumber = cardNumber;
        }else{
            throw new IllegalArgumentException("Card number must be 16 digits");
        }
    }

    /**
     * Return pin code
     * @return pin
     */
    public PinCode getPin() {
        return pin;
    }

    /**
     * Set new pin code
     * @param pin
     */
    public void  setPin(PinCode pin) {
            this.pin =  pin;

    }

    /**
     * Return validity
     * @return return validity;
     */
    public String getValidity() {
        return validity;
    }

    /**
     * Chek validity regular "\\d{4}" and set new validity
     * @param validity
     * @throws IllegalArgumentException
     */
    private void setValidity(String validity) throws IllegalArgumentException {
        if (validity.matches("\\d{4}")){
            this.validity = validity;
        }else{
            throw new IllegalArgumentException("Validity period must be 4 digits month and year");
        }

    }

    /**
     * Return balance card
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Set new balance
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Return CVV
     * @return CVV
     */
    public String getCVV() {
        return CVV;
    }

    /**
     * Chek regular "\\d{3}" and set new CVV
     * @param CVV
     * @throws IllegalArgumentException
     */
    public void setCVV(String CVV) throws IllegalArgumentException{
        if (CVV.matches("\\d{3}")){
            this.CVV = CVV;
        }else{
            throw new IllegalArgumentException("CVV code must be 3 digits");
        }

    }

    /**
     * Return CurencyAbrEnum UAH or USD
     * @return
     */
    public CurencyAbrEnum getCurency() {
        return curency;
    }

    /**
     * Debit card balance
     * @param sum
     */
    public void debitCard (double sum){

        this.balance = getBalance() - sum;
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", pin=" + pin +
                ", validity='" + validity + '\'' +
                ", balance=" + balance +
                ", CVV='" + CVV + '\'' +
                ", curency=" + curency +
                '}';
    }

    /**
     * equals
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return Double.compare(card.getBalance(), getBalance()) == 0 &&
                Objects.equals(getCardNumber(), card.getCardNumber()) &&
                Objects.equals(getPin(), card.getPin()) &&
                Objects.equals(getValidity(), card.getValidity()) &&
                Objects.equals(getCVV(), card.getCVV()) &&
                getCurency() == card.getCurency();
    }

    /**
     * hashCode
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(getCardNumber(), getPin(), getValidity(), getBalance(), getCVV(), getCurency());
    }
}
