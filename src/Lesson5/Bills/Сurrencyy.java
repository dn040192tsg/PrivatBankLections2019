package Lesson5.Bills;

/**
 * Клас описывающий свойство валюты
 */

public class Сurrencyy {

    private String typeCurrency = null;  // тип валюты
    private String faceValue = null;     // номинал валюты
    private String abr = null;           // абривиатура валюты

    public Сurrencyy(String typeCurrency, String faceValue, String abr) {
        setAbr(abr);
        setTypeCurrencey(typeCurrency);
        setFaceValue(faceValue);
    }

    public String getTypeCurrencey() {
        return typeCurrency;
    }

    public void setTypeCurrencey(String typeCurrencey) {
        if (typeCurrencey == "usd" || typeCurrencey == "eur" || typeCurrencey == "rur" || typeCurrencey == "uah") {
            this.typeCurrency = typeCurrencey;
        } else {
            System.out.println("\"валюта должна быть abr == \"UAH\" || abr == \"USD\" || abr == \"RUR\" || abr == \"UAH\" ");
        }
    }

    public String getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(String faceValue) {

        switch (abr) {

            case "USD":
                if (faceValue == "1" || faceValue == "2" || faceValue == "5" | faceValue == "10" || faceValue == "20" || faceValue == "50" || faceValue == "100") {
                    System.out.println("Валюта создана " + faceValue + " " + abr);
                    this.faceValue = faceValue;
                } else {
                    System.out.println("Ошибка валюта должна быть faceValue == \"1\" || faceValue == \"2\" || faceValue == \"5\" | faceValue == \"10\" || faceValue == \"20\" || faceValue == \"50\" || faceValue == \"100\"");
                    ;
                }
                ;
                break;

            case "UAH":
                if (faceValue == "1" || faceValue == "2" || faceValue == "5" | faceValue == "10" || faceValue == "20" || faceValue == "50" || faceValue == "100" || faceValue == "200" || faceValue == "500") {
                    System.out.println("Валюта создана " + faceValue + " " + abr);
                } else {
                    this.faceValue = faceValue;
                    System.out.println("Ошибка валюта должна быть faceValue == \"1\" || faceValue == \"2\" || faceValue == \"5\" | faceValue == \"10\" || faceValue == \"20\" || faceValue == \"50\" || faceValue == \"100\" || faceValue == \"200\" || faceValue == \"500\"");
                }
                ;
                break;

            case "EUR":
                if (faceValue == "1" || faceValue == "2" || faceValue == "5" | faceValue == "10" || faceValue == "20" || faceValue == "50" || faceValue == "100" || faceValue == "200" || faceValue == "500") {
                    this.faceValue = faceValue;
                    System.out.println("Валюта создана " + faceValue + " " + abr);
                } else {
                    System.out.println("Ошибка валюта должна быть faceValue == \"1\" || faceValue == \"2\" || faceValue == \"5\" | faceValue == \"10\" || faceValue == \"20\" || faceValue == \"50\" || faceValue == \"100\" || faceValue == \"200\" || faceValue == \"500\"");
                }
                ;
                break;

            case "RUR":
                if (faceValue == "1" || faceValue == "2" || faceValue == "5" | faceValue == "10" || faceValue == "20" || faceValue == "50" || faceValue == "100" || faceValue == "200" || faceValue == "500" || faceValue == "1000" || faceValue == "2000" || faceValue == "5000") {
                    this.faceValue = faceValue;
                    System.out.println("Валюта создана " + faceValue + " " + abr);
                } else {
                    System.out.println("Ошибка валюта должна быть faceValue == \"1\" || faceValue == \"2\" || faceValue == \"5\" | faceValue == \"10\" || faceValue == \"20\" || faceValue == \"50\" || faceValue == \"100\" || faceValue == \"200\" || faceValue == \"500\" || faceValue == \"1000\"|| faceValue == \"2000\"|| faceValue == \"5000\"");
                }
                ;
                break;

        }

    }

    public String getAbr() {
        return abr;
    }

    public void setAbr(String abr) {
        if (abr == "EUR" || abr == "USD" || abr == "RUR" || abr == "UAH") {
            this.abr = abr;
        } else {
            System.out.println("Валюта должна быть abr == \"UAH\" || abr == \"USD\" || abr == \"RUR\" || abr == \"UAH\"");
        }
    }

    @Override
    public String toString() {
        return "Сurrencyy{" +
                "typeCurrency='" + typeCurrency + '\'' +
                ", faceValue='" + faceValue + '\'' +
                ", abr='" + abr + '\'' +
                '}';
    }
}
