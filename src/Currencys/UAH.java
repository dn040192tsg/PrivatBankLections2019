package Currencys;


import Currencys.CurrencyEnum.CurencyAbrEnum;
import Currencys.CurrencyEnum.TypesCurencyEnum;
import Currencys.CurrencyEnum.TypesFaceValueEnumUAH;

/**
 * Class UAH
 */
public class UAH extends Currencyy {

    /**
     * @see Currencyy
     * @param typeCurrency
     * @param faceValue
     * @param abr
     */
    public UAH(TypesCurencyEnum typeCurrency, TypesFaceValueEnumUAH faceValue, CurencyAbrEnum abr) {
        super(TypesCurencyEnum.HRIVNA, faceValue.getFaceValue(), CurencyAbrEnum.UAH);
    }



}
