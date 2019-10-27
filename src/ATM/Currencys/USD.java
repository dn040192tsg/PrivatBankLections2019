package ATM.Currencys;


import ATM.Currencys.CurrencyEnum.CurencyAbrEnum;
import ATM.Currencys.CurrencyEnum.TypesCurencyEnum;
import ATM.Currencys.CurrencyEnum.TypesFaceValueEnumUSD;

public class USD extends Currencyy {


    public USD(TypesCurencyEnum typeCurrency, TypesFaceValueEnumUSD faceValue, CurencyAbrEnum abr) {
        super(typeCurrency, faceValue.getFaceValue(), abr);
    }


}
