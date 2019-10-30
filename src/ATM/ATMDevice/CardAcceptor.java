package ATM.ATMDevice;

import ATM.Bills.Card;

/**
 * Class describer work card acceptor
 */
public class CardAcceptor {
    /**
     * Name device
     */
    String name = null;
    /**
     * link object Card, if field null card is not in the card reader
     */
    Card card = null;

    /**
     * Constructor
     * @param name name device
     */
    public CardAcceptor(String name) {
        this.name = name;
    }

    /**
     * Retturn link object Card, if field null card is not in the card reader
     * @param card link object Card, if field null card is not in the card reader
     */
    public void takeCard (Card card){
        this.card = card;
    }

    /**
     * Removes the card from the card reader
     */
    public void pushCard (){
        this.card = null;
    }

    /**
     * Return link object Card if field null card is not in the card reader
     * @return link object Card
     */
    public Card readCard (){
      return this.card;
    }

    /**
     * Standart getter
     * @return name device
     */
    public String getName() {
        return name;
    }

    /**
     * Standart setter
     * @param name name device
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter
     * @return
     */
    public Card getCard() {
        return card;
    }
}
