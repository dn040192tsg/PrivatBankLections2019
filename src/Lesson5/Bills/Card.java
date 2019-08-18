package Lesson5.Bills;


import java.util.Currency;
import java.util.Date;

/**
 * Класс описывающий свойство карты
 */

public class Card {
    private int cardNumber = 0; //номер каты
    private PinCode pin = null; // пмн код
    private Date validity = null; // срок действия
    private Currency currency = null; // счет

    public Card(int cardNumber, PinCode pin, Date validity, Currency currency) {
        setCardNumber(cardNumber);
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

        if (Integer.toString(cardNumber).length() == 16){
            this.cardNumber = cardNumber;
        }else {
            System.out.println("Ошибка номер карты должен быть 16 цифр");
        };
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

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", pin=" + pin +
                ", validity=" + validity +
                ", currency=" + currency +
                '}';
    }
}
