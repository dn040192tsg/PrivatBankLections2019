package Lesson5.Currencys;

/**
 * Клас описывающий свойство валюты
 */

public  abstract class Currencyy {

    public String typeCurrency;  // тип валюты
    public String faceValue;     // номинал валюты
    public String abr;           // абривиатура валюты

    public Currencyy(String typeCurrency, String faceValue, String abr) {
        this.typeCurrency = typeCurrency;
        this.faceValue = faceValue;
        this.abr = abr;
    }

    public abstract void setTypeCurrencey(String typeCurrencey);
    public abstract void setFaceValue(String faceValue);
    public abstract void setAbr(String abr);


    public String getAbr() {
        return abr;
    }

    public String getFaceValue() {
        return faceValue;
    }

    public String getTypeCurrencey() {
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
}
