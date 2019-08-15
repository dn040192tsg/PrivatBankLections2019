package Lesson5;

public class Сurrencyy {

    String typeCurrency = null;
    String faceValue = null;
    String abr = null;

    public Сurrencyy(String typeCurrency, String faceValue, String abr) {
        this.typeCurrency = typeCurrency;
        this.faceValue = faceValue;
        this.abr = abr;
    }

    public String getTypeCurrencey() {
        return typeCurrency;
    }

    public void setTypeCurrencey(String typeCurrencey) {
        if (typeCurrencey == "usd" || typeCurrencey == "eur" || typeCurrencey == "rur"){
            this.typeCurrency = typeCurrencey;
        }else{
            System.out.println("валюта должна быть typeCurrencey == \"UAH\" || typeCurrencey == \"USD\" || typeCurrencey == \"RUR\" ");
        }
    }

    public String getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(String faceValue) {
        if (faceValue == "10"||faceValue == "100"|| faceValue =="500"){
            this.faceValue = faceValue;
        }else{
            System.out.println("номинал должен быть faceValue == \"10\"||faceValue == \"100\"|| faceValue ==\"500\"");
        }

    }

    public String getAbr() {
        return abr;
    }

    public void setAbr(String abr) {
        if (abr == "EUR" || abr == "USD" || abr == "RUR"){
            this.abr = abr;
        }else{
            System.out.println("валюта должна быть tbr == \"UAH\" || abr == \"USD\" || abr == \"RUR\"");
        }
    }
}
