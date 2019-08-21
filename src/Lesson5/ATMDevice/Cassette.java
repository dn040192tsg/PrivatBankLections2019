package Lesson5.ATMDevice;

import Lesson5.Currencys.Currencyy;
import java.util.ArrayList;

/**
 * Клас описывающий касету банкомата
 */

public class Cassette {

    private ArrayList<Currencyy> currencyList = new ArrayList<>();
    private int kassetSize = 0;
    private String cassetName = null;

    public Cassette(Currencyy currency, int kassetSize, String cassetName) {
        this.kassetSize = kassetSize;
        this.cassetName = cassetName;
        addCurrency(currency);

    }

    public String getCassetName() {
        return cassetName;
    }

    public void setCassetName(String cassetName) {
        this.cassetName = cassetName;
    }

    public void addCurrency (Currencyy currencyy){
        if (kassetSize > currencyList.size()) {
            currencyList.add(currencyy);
            System.out.println("Валюта добавлена в касету");
            kassetSize++;
        }else {
            System.out.println("Касета переполнена");
        }
    }

    public ArrayList<Currencyy> getCurrencyList() {
        return currencyList;
    }



    @Override
    public String toString() {
        return "Cassette{" +
                "currencyList=" + currencyList +
                ", kassetSize=" + kassetSize +
                '}';
    }
}
