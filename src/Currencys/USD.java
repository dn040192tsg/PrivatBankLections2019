package Currencys;


import Currencys.CurrencyEnum.CurencyAbrEnum;
import Currencys.CurrencyEnum.TypesCurencyEnum;
import Currencys.CurrencyEnum.TypesFaceValueEnumUSD;

/**
 * Class USD
 */
public class USD extends Currencyy {

    /**
     * @see Currencyy
     * @param typeCurrency
     * @param faceValue
     * @param abr
     */
    public USD(TypesCurencyEnum typeCurrency, TypesFaceValueEnumUSD faceValue, CurencyAbrEnum abr) {
        super(typeCurrency, faceValue.getFaceValue(), abr);
    }


}
