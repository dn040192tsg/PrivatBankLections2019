package ATM.ATMDevice;

import ATM.Currencys.*;
import ATM.Currencys.CurrencyEnum.CurencyAbrEnum;
import ATM.Currencys.CurrencyEnum.TypesFaceValueEnumUAH;
import ATM.Currencys.UAH;

import java.util.*;

/**
 * Клас описывающий касету банкомата
 */

public class Cassette {

    private Map<Currencyy, Integer> currencyList = new HashMap();

    private final int kassetSize = 100;
    private String cassetName = null;
    private CurencyAbrEnum cassetCuerrency;
    private Integer[] typesFaceValue;

    public Cassette(String cassetName, CurencyAbrEnum cassetCuerrency) {
        this.cassetName = cassetName;
        this.cassetCuerrency = cassetCuerrency;
        setTypesFaceValue();

    }

    public void setTypesFaceValue() {

        for (int i = 0; i < CurencyAbrEnum.values().length; i++) {
            if (cassetCuerrency == CurencyAbrEnum.values()[i]) {
                this.typesFaceValue = TypesFaceValueEnumUAH.values();
            }
        }

    }

    public String sumCurrency() {

        String responce = "";

        for (Currencyy x : currencyList.keySet()) {
            responce += x.getFaceValue() + " ";
        }
        return responce;
    }

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
                            result += coefficient + " по " + typesFaceValue[i] + " " + t.getKey().getAbr();
                        } else {
                            debetSum -= typesFaceValue[i] * t.getValue();
                            currencyList.remove(t);
                            result += t.getValue() + " по " + typesFaceValue[i] + " " + t.getKey().getAbr();
                        }
                    }
                }
            }
        }

        return result;
    }

    public int affordableCash() {
        int sum = 0;
        for (Map.Entry<Currencyy, Integer> x : currencyList.entrySet()) {
            sum += x.getKey().getFaceValue() * x.getValue();
        }
        return sum;
    }

    public int minCurrency() {
        return Collections.min(currencyList.keySet()).getFaceValue();
    }

    public String getCassetName() {
        return cassetName;
    }

    public void setCassetName(String cassetName) {
        this.cassetName = cassetName;
    }

    public void addCurrency(UAH currencyy, int col) {
        currencyList.put(currencyy, col);
    }

    public CurencyAbrEnum getCassetCuerrency() {
        return cassetCuerrency;
    }

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