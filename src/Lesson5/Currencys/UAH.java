package Lesson5.Currencys;

import Lesson5.Currencys.Currencyy;

public class UAH extends Currencyy {


    public UAH(String typeCurrency, String faceValue, String abr) {
        super(typeCurrency, faceValue, abr);
    }

    @Override
    public void setTypeCurrencey(String typeCurrencey) {
        if (typeCurrencey == "Hrivna") {
            this.typeCurrency = typeCurrencey;
        }else {
            System.out.println("Тип валюты может быть только Hrivna");
        }
    }

    @Override
    public void setFaceValue(String faceValue) {
        if (faceValue == "1"||faceValue == "2"||faceValue == "5" || faceValue == "10" || faceValue == "50" || faceValue == "100"|| faceValue == "200"|| faceValue == "500"){
            this.faceValue = faceValue;
        }else {
            System.out.println("Валюта UAH должна быть только номиналом 1,2,5,10,20,50,100,200,500");
        }
    }

    @Override
    public void setAbr(String abr) {
        if (abr == "UAH") {
            this.abr = abr;
        }else {
            System.out.println("Тип валюты может быть только UAH");
        }
    }
}
