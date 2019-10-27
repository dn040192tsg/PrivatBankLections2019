package ATM.Currencys;


import ATM.Currencys.CurrencyEnum.CurencyAbrEnum;
import ATM.Currencys.CurrencyEnum.TypesCurencyEnum;
import ATM.Currencys.CurrencyEnum.TypesFaceValueEnumUAH;

public class UAH extends Currencyy {


    public UAH(TypesCurencyEnum typeCurrency, TypesFaceValueEnumUAH faceValue, CurencyAbrEnum abr) {
        super(TypesCurencyEnum.HRIVNA, faceValue.getFaceValue(), CurencyAbrEnum.UAH);
    }



}
