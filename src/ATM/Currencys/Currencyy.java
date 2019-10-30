package ATM.Currencys;

import ATM.Currencys.CurrencyEnum.CurencyAbrEnum;
import ATM.Currencys.CurrencyEnum.TypesCurencyEnum;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class describes currency method and field
 */
public  abstract class Currencyy implements Comparable <Currencyy>, Serializable {

    /**
     * Enum HRIVNA or DOLLAR
     */
    private TypesCurencyEnum typeCurrency;
    /**
     *  Nominal
     */
    private int faceValue;
    /**
     * Enunm UAH or USD
     */
    private CurencyAbrEnum abr;
    /**
     * For serilization
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor
     * @param typeCurrency
     * @param faceValue
     * @param abr
     */
    public Currencyy(TypesCurencyEnum typeCurrency, int faceValue, CurencyAbrEnum abr) {
        this.typeCurrency = typeCurrency;
        this.faceValue = faceValue;
        this.abr = abr;
    }

    /**
     * Return abr
     * @return abr
     */
    public CurencyAbrEnum getAbr() {
        return abr;
    }

    /**
     * Return faceValue
     * @return
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Return TypesCurencyEnum
     * @return
     */
    public TypesCurencyEnum getTypeCurrency() {
        return typeCurrency;
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        return "Currencyy{" +
                "typeCurrency='" + typeCurrency + '\'' +
                ", faceValue='" + faceValue + '\'' +
                ", abr='" + abr + '\'' +
                '}';
    }

    /**
     * equals
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Currencyy)) return false;
        Currencyy currencyy = (Currencyy) o;
        return Objects.equals(typeCurrency, currencyy.typeCurrency) &&
                Objects.equals(getFaceValue(), currencyy.getFaceValue()) &&
                Objects.equals(getAbr(), currencyy.getAbr());
    }

    /**
     * hashCode
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(typeCurrency, getFaceValue(), getAbr());
    }

    /**
     * compareTo
     * @param o
     * @return
     */
    @Override
    public int compareTo(Currencyy o) {

        return faceValue - o.faceValue ;
    }
}
