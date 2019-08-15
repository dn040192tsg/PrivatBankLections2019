package Lesson5;

import java.util.Currency;
import java.util.Date;

public class Card {
    int cardNumber = 0;
    PinCode pin = null;
    Date validity = null;
    Currency currency = null;

    public Card(int cardNumber, PinCode pin, Date validity, Currency currency) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.validity = validity;
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public PinCode getPin() {
        return pin;
    }

    public void setPin(PinCode pin) {
        this.pin = pin;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }


}
