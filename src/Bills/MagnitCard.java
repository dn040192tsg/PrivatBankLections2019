package Bills;

import Currencys.CurrencyEnum.CurencyAbrEnum;

/**
 * Class magnit card extends Card
 */
public abstract class MagnitCard extends Card {

    /**
     * Magnit line some inform
     */
    private String magnitLine;

    /**
     * @param cardNumber
     * @param pin
     * @param validity
     * @param balance
     * @param CVV
     * @param curency
     * @see Card
     */
    public MagnitCard(String cardNumber, PinCode pin, String validity, int balance, String CVV, CurencyAbrEnum curency) {
        super(cardNumber, pin, validity, balance, CVV, curency);
    }


    /**
     * Set magnit card
     */
    public void setMagnitLine(String magnitLine) {
        this.magnitLine = magnitLine;
    }

    /**
     * Get magnit card
     */
    public String getMagnitLine(String magnitLine) {
        return magnitLine;
    }

    /**
     * Chek magnit line
     *
     * @param magnitLine
     * @return
     */
    public abstract boolean chekMagnitLine(String magnitLine);


}
