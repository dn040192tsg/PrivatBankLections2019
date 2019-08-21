package Lesson5.Actions;

import Lesson5.ATMDevice.ATM;
import Lesson5.Bills.Currencyy;


public class OutMoney {

ATM atm = null;

    public OutMoney(ATM atm) {
        this.atm = atm;
    }

    public void sendMoney (){
        for (Currencyy x : atm.getCassette().getCurrencyList()) {

        }
        atm.getCassette();
    }
}
