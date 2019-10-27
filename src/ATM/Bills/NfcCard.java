package ATM.Bills;


import ATM.Currencys.CurrencyEnum.CurencyAbrEnum;

public abstract class NfcCard extends ChipCard {

    private String NFC;

    public NfcCard(String cardNumber, PinCode pin, String validity, int balance, String CVV, CurencyAbrEnum curency) {
        super(cardNumber, pin, validity, balance, CVV, curency);
    }


    public  String getNFC(String NFC){
        return NFC;
    };
    public abstract boolean chekNFC(String NFC);


    public void setNFC(String NFC) {
        this.NFC = NFC;
    }
}
