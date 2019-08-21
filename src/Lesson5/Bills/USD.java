package Lesson5.Bills;


public class USD extends Currencyy {


    public USD(String typeCurrency, String faceValue, String abr) {
        super(typeCurrency, faceValue, abr);
    }

    @Override
    public void setTypeCurrencey(String typeCurrencey) {
        if (typeCurrencey == "Dollar") {
            this.typeCurrency = typeCurrencey;
        }else {
            System.out.println("Тип валюты может быть только Dollar");
        }
    }

    @Override
    public void setFaceValue(String faceValue) {
        if (faceValue == "1"||faceValue == "2"||faceValue == "5" || faceValue == "10" || faceValue == "50" || faceValue == "100"){
            this.faceValue = faceValue;
        }else {
            System.out.println("Валюта USD должна быть только номиналом 1,2,5,10,20,50,100");
        }
    }

    @Override
    public void setAbr(String abr) {
        if (abr == "USD") {
            this.abr = abr;
        }else {
            System.out.println("Тип валюты может быть только USD");
        }
    }
}
