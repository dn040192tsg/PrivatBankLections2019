package ATM.ATMDevice;

import ATM.Currencys.*;
import ATM.Currencys.CurrencyEnum.CurencyAbrEnum;
import ATM.Currencys.CurrencyEnum.TypesFaceValueEnumUAH;
import ATM.Currencys.UAH;

import java.util.*;

/**
 * Class describes work cassette ATM. Casetta contains notes and participates in the issuance of money.
 */
public class Cassette {
    /**
     * Collections Currencyy where cassette money is stored
     */
    private Map<Currencyy, Integer> currencyList = new HashMap();
    /**
     * max count currency in Cassette
     */
    private final int kassetSize = 100;
    /**
     * name device
     */
    private String cassetName = null;
    /**
     * Enum UAH, USD
     */
    private CurencyAbrEnum cassetCuerrency;
    /**
     * Enum face value currency
     */
    private Integer[] typesFaceValue;

    /**
     * Constructor initializes field class
     * @param cassetName
     * @param cassetCuerrency
     */
    public Cassette(String cassetName, CurencyAbrEnum cassetCuerrency) {
        this.cassetName = cassetName;
        this.cassetCuerrency = cassetCuerrency;
        setTypesFaceValue();

    }

    /**
     * Method add all type face value currency for UAH
     */
    public void setTypesFaceValue() {
        for (int i = 0; i < CurencyAbrEnum.values().length; i++) {
            if (cassetCuerrency == CurencyAbrEnum.values()[i]) {
                this.typesFaceValue = TypesFaceValueEnumUAH.values();
            }
        }

    }

    /**
     * lavailable withdrawal bills
     * @return String withdrawal bills
     */
    public String sumCurrency() {

        String responce = "";

        for (Currencyy x : currencyList.keySet()) {
            responce += x.getFaceValue() + " ";
        }
        return responce;
    }

    /**
     * Method return true or false, cheks if it is possible to withdraw the amount at the ATM indicated by the user
     * @param sum Amount requested by user for withdrawal
     * @return true or false
     */
    public boolean availableCurrency(int sum) {

        int debetSum = sum;
        int coefficient;

        Arrays.sort(typesFaceValue, Collections.reverseOrder());

        for (int i = 0; i < typesFaceValue.length; i++) {
            if (debetSum >= typesFaceValue[i] && debetSum > 0) {
                coefficient = debetSum / typesFaceValue[i];
                for (Map.Entry<Currencyy, Integer> t : currencyList.entrySet()) {
                    if (t.getKey().getFaceValue() == typesFaceValue[i]) {
                        if (t.getValue() >= coefficient) {
                            debetSum -= typesFaceValue[i] * coefficient;
                        } else {
                            debetSum -= typesFaceValue[i] * t.getValue();

                        }
                    }
                }
            }
        }
        if (debetSum == 0) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Method removes from the cassette the amount that the user entered to withdraw and return what banknotes was the amount withdrawn
     * @param sum
     * @return
     */
    public String debitCassete(int sum) {

        String result = "";
        int debetSum = sum;
        int coefficient;

        Arrays.sort(typesFaceValue, Collections.reverseOrder());

        for (int i = 0; i < typesFaceValue.length; i++) {

            if (debetSum >= typesFaceValue[i] && debetSum > 0) {
                coefficient = debetSum / typesFaceValue[i];
                for (Map.Entry<Currencyy, Integer> t : currencyList.entrySet()) {
                    if (t.getKey().getFaceValue() == typesFaceValue[i]) {
                        if (t.getValue() >= coefficient) {
                            t.setValue(t.getValue() - coefficient);
                            debetSum -= typesFaceValue[i] * coefficient;
                            result += coefficient + " - " + typesFaceValue[i] + " " + t.getKey().getAbr();
                        } else {
                            debetSum -= typesFaceValue[i] * t.getValue();
                            currencyList.remove(t);
                            result += t.getValue() + " - " + typesFaceValue[i] + " " + t.getKey().getAbr();
                        }
                    }
                }
            }
        }

        return result;
    }
    /**
     * Method return how all money in cassette
     * @return all money in cassette
     */
    public int affordableCash() {
        int sum = 0;
        for (Map.Entry<Currencyy, Integer> x : currencyList.entrySet()) {
            sum += x.getKey().getFaceValue() * x.getValue();
        }
        return sum;
    }

    /**
     * Standart getter
     * @return cassetName
     */
    public String getCassetName() {
        return cassetName;
    }
    /**
     * Standart setter
     * @param  cassetName
     */
    public void setCassetName(String cassetName) {
        this.cassetName = cassetName;
    }

    /**
     * Method add Currency in currencyList
     * @param currencyy
     * @param col
     */
    public void addCurrency(UAH currencyy, int col) {
        currencyList.put(currencyy, col);
    }

    /**
     * Standart getter
     * @see Cassette#cassetCuerrency
     * @return link
     */
    public CurencyAbrEnum getCassetCuerrency() {
        return cassetCuerrency;
    }

    /**
     * Standart toString
     * @return String
     */
    @Override
    public String toString() {
        return "Cassette{" +
                "currencyList=" + currencyList +
                ", kassetSize=" + kassetSize +
                ", cassetName='" + cassetName + '\'' +
                ", cassetCuerrency=" + cassetCuerrency +
                ", typesFaceValue=" + Arrays.toString(typesFaceValue) +
                '}';
    }
}