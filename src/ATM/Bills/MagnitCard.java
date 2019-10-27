package ATM.Bills;

import ATM.Currencys.CurrencyEnum.CurencyAbrEnum;

public abstract class MagnitCard extends Card {


    private String magnitLine;

    public MagnitCard(String cardNumber, PinCode pin, String validity, int balance, String CVV, CurencyAbrEnum curency) {
        super(cardNumber, pin, validity, balance, CVV, curency);
    }



    public void setMagnitLine(String magnitLine) {
        this.magnitLine = magnitLine;
    }


    public  String getMagnitLine(String magnitLine){
        return magnitLine;
    }

    public abstract boolean chekMagnitLine(String magnitLine);



}
