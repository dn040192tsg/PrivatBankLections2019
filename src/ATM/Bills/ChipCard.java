package ATM.Bills;


import ATM.Currencys.CurrencyEnum.CurencyAbrEnum;

public abstract class ChipCard extends MagnitCard {


    private String chip;

    public ChipCard(String cardNumber, PinCode pin, String validity, int balance, String CVV, CurencyAbrEnum curency) {
        super(cardNumber, pin, validity, balance, CVV, curency) ;
    }


    public  String getChip(String chip){
        return chip;
    }
    public abstract boolean chekChip(String chip);


    public void setChip(String chip) {
        this.chip = chip;
    }
}
