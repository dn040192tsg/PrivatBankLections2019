package ATM.Currencys;

import ATM.Currencys.CurrencyEnum.CurencyAbrEnum;
import ATM.Currencys.CurrencyEnum.TypesCurencyEnum;

import java.io.Serializable;
import java.util.Objects;

/**
 * Клас описывающий свойство валюты
 */

public  abstract class Currencyy implements Comparable <Currencyy>, Serializable {

    private TypesCurencyEnum typeCurrency;  // тип валюты
    private int faceValue;     // номинал валюты
    private CurencyAbrEnum abr;           // абривиатура валюты
    private static final long serialVersionUID = 1L;


    public Currencyy(TypesCurencyEnum typeCurrency, int faceValue, CurencyAbrEnum abr) {
        this.typeCurrency = typeCurrency;
        this.faceValue = faceValue;
        this.abr = abr;
    }

    public CurencyAbrEnum getAbr() {
        return abr;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public TypesCurencyEnum getTypeCurrency() {
        return typeCurrency;
    }


    @Override
    public String toString() {
        return "Currencyy{" +
                "typeCurrency='" + typeCurrency + '\'' +
                ", faceValue='" + faceValue + '\'' +
                ", abr='" + abr + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Currencyy)) return false;
        Currencyy currencyy = (Currencyy) o;
        return Objects.equals(typeCurrency, currencyy.typeCurrency) &&
                Objects.equals(getFaceValue(), currencyy.getFaceValue()) &&
                Objects.equals(getAbr(), currencyy.getAbr());
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeCurrency, getFaceValue(), getAbr());
    }

    @Override
    public int compareTo(Currencyy o) {

        return faceValue - o.faceValue ;
    }
}
