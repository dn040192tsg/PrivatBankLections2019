package ATM.Bills;

import ATM.Currencys.CurrencyEnum.CurencyAbrEnum;

import java.io.Serializable;
import java.util.Objects;

/**
 * Класс описывающий свойство карты
 */

public abstract class Card implements Serializable {

    private String cardNumber; //номер каты
    private PinCode pin; // пмн код
    private String validity; // срок действия
    private double balance; // баланс
    private String CVV; // cvv код карты
    private CurencyAbrEnum curency;
    private static final long serialVersionUID = 1L;


    public Card(String cardNumber, PinCode pin, String validity, int balance, String CVV, CurencyAbrEnum curency) {
        setCardNumber(cardNumber);
        this.pin = pin;
        this.validity = validity;
        this.balance = balance;
        this.CVV = CVV;
        this.curency = curency;

    }

    public String getCardNumber() {
        return cardNumber;
    }

    private void setCardNumber(String cardNumber) throws IllegalArgumentException {

        if (cardNumber.matches("\\d{16}")){
            this.cardNumber = cardNumber;
        }else{
            throw new IllegalArgumentException("Номер карты должен состоять из 16 цифр");
        }
    }

    public PinCode getPin() {
        return pin;
    }

    public void  setPin(PinCode pin) {
            this.pin =  pin;

    }

    public String getValidity() {
        return validity;
    }

    private void setValidity(String validity) throws IllegalArgumentException {
        if (validity.matches("\\d{4}")){
            this.validity = validity;
        }else{
            throw new IllegalArgumentException("Срок действия должен состоять из 4 цифр месяц и год");
        }

    }

    public double getBalance() {
        return balance;
    }


    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) throws IllegalArgumentException{
        if (CVV.matches("\\d{3}")){
            this.CVV = CVV;
        }else{
            throw new IllegalArgumentException("CVV код должен состоять из 3 цифр");
        }

    }

    public CurencyAbrEnum getCurency() {
        return curency;
    }

    public void debitCard (double sum){

        this.balance = getBalance() - sum;
    }

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

    @Override
    public int hashCode() {
        return Objects.hash(getCardNumber(), getPin(), getValidity(), getBalance(), getCVV(), getCurency());
    }
}
