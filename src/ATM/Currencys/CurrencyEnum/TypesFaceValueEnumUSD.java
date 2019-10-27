package ATM.Currencys.CurrencyEnum;

public class TypesFaceValueEnumUSD {

    private int faceValue;

    private TypesFaceValueEnumUSD(int faceValue) {
        this.faceValue = faceValue;
    }

    public static final TypesFaceValueEnumUSD one = new TypesFaceValueEnumUSD(1);
    public static final TypesFaceValueEnumUSD two = new TypesFaceValueEnumUSD(2);
    public static final TypesFaceValueEnumUSD five = new TypesFaceValueEnumUSD(5);
    public static final TypesFaceValueEnumUSD ten = new TypesFaceValueEnumUSD(10);
    public static final TypesFaceValueEnumUSD twenty = new TypesFaceValueEnumUSD(20);
    public static final TypesFaceValueEnumUSD fifty = new TypesFaceValueEnumUSD(50);
    public static final TypesFaceValueEnumUSD oneHundred = new TypesFaceValueEnumUSD(100);


    public static Integer [] values(){
        return new Integer []{one.faceValue, two.faceValue, five.faceValue, ten.faceValue,twenty.faceValue,
                fifty.faceValue, oneHundred.faceValue };
    }

    public int getFaceValue() {
        return faceValue;
    }

}
