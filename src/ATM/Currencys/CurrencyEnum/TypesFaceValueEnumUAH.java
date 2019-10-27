package ATM.Currencys.CurrencyEnum;


public  class TypesFaceValueEnumUAH {

    private int faceValue;

    private TypesFaceValueEnumUAH(int faceValue) {
        this.faceValue = faceValue;
    }

    public static final TypesFaceValueEnumUAH one = new TypesFaceValueEnumUAH(1);
    public static final TypesFaceValueEnumUAH two = new TypesFaceValueEnumUAH(2);
    public static final TypesFaceValueEnumUAH five = new TypesFaceValueEnumUAH(5);
    public static final TypesFaceValueEnumUAH ten = new TypesFaceValueEnumUAH(10);
    public static final TypesFaceValueEnumUAH twenty = new TypesFaceValueEnumUAH(20);
    public static final TypesFaceValueEnumUAH fifty = new TypesFaceValueEnumUAH(50);
    public static final TypesFaceValueEnumUAH oneHundred = new TypesFaceValueEnumUAH(100);
    public static final TypesFaceValueEnumUAH twoHundred = new TypesFaceValueEnumUAH(200);
    public static final TypesFaceValueEnumUAH fiveHundred = new TypesFaceValueEnumUAH(500);

    public  static Integer[] values() {
        Integer [] arr =  {one.faceValue, two.faceValue, five.faceValue, ten.faceValue, twenty.faceValue, fifty.faceValue, oneHundred.faceValue, twoHundred.faceValue, fiveHundred.faceValue};
        return  arr;
    }

    public int getFaceValue() {
        return faceValue;
    }

}
