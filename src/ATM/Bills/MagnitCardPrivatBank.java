package ATM.Bills;

import ATM.Currencys.CurrencyEnum.CurencyAbrEnum;

public class MagnitCardPrivatBank extends MagnitCard {


    public MagnitCardPrivatBank(String cardNumber, PinCode pin, String validity, int balance, String CVV, CurencyAbrEnum curency) {
        super(cardNumber, pin, validity, balance, CVV, curency);
    }

    @Override
    public boolean chekMagnitLine(String magnitLine) {
        return false;
    }
}
