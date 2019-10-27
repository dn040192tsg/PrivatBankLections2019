package ATM.ATMDevice;

import ATM.Bills.Card;

/**
 * Клас описывающий работу картоприемника
 */
public class CardAcceptor {
    String name = null;
    Card card = null;

    public CardAcceptor(String name) {
        this.name = name;
    }

    public void takeCard (Card card){

        this.card = card;
    }

    public void pushCard (){
        this.card = null;
    }


    public Card readCard (){
        //абстрактное считываени данных с карты
      return this.card;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getCard() {
        return this.card;
    }

}
