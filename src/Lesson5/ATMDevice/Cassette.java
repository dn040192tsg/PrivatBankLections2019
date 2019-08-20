package Lesson5.ATMDevice;

import Lesson5.Bills.Сurrencyy;
import java.util.ArrayList;

/**
 * Клас описывающий касету банкомата
 */

public class Cassette {

    private ArrayList<Сurrencyy> currencyList = new ArrayList<>();
    private int kassetSize = 0;
    private String cassetName = null;

    public Cassette(Сurrencyy currency, int kassetSize, String cassetName) {
        addCurrency(currency);
         this.kassetSize = kassetSize;
        this.cassetName = cassetName;
    }

    public String getCassetName() {
        return cassetName;
    }

    public void setCassetName(String cassetName) {
        this.cassetName = cassetName;
    }

    public void addCurrency (Сurrencyy currencyy){
        if (kassetSize > currencyList.size()) {
            currencyList.add(currencyy);
            System.out.println("Валюта добавлена в касету");
            kassetSize++;
        }else {
            System.out.println("Касета переполнена");
        }
    }

    public ArrayList<Сurrencyy> getCurrencyList() {
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
