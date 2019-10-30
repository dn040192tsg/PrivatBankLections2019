package Bills;

import Currencys.CurrencyEnum.CurencyAbrEnum;

public class MagnitCardPrivatBank extends MagnitCard {

    /**
     * @see Card
     * @param cardNumber
     * @param pin
     * @param validity
     * @param balance
     * @param CVV
     * @param curency
     */
    public MagnitCardPrivatBank(String cardNumber, PinCode pin, String validity, int balance, String CVV, CurencyAbrEnum curency) {
        super(cardNumber, pin, validity, balance, CVV, curency);
    }

    /**
     * @see MagnitCard#chekMagnitLine(String) 
     * @param magnitLine
     * @return
     */
    @Override
    public boolean chekMagnitLine(String magnitLine) {
        return false;
    }
}
