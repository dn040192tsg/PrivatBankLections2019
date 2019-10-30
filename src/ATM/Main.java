package ATM;


import ATM.Actions.SystemMenuATM;
import ATM.Bills.Card;
import ATM.Bills.MagnitCardPrivatBank;
import ATM.Bills.PinCode;
import ATM.Currencys.CurrencyEnum.CurencyAbrEnum;
import ATM.Currencys.CurrencyEnum.TypesCurencyEnum;
import ATM.Currencys.CurrencyEnum.TypesFaceValueEnumUAH;
import ATM.Currencys.UAH;

import java.io.*;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class Main {

    public static final Logger log = Logger.getLogger(Main.class.getName());// loger


    public static void main(String[] args) throws IOException {

       LogManager.getLogManager().readConfiguration(Main.class.getResourceAsStream("Log.properties"));
        // create card PrivatBank
        Card card = new MagnitCardPrivatBank("4149121223344559", new PinCode("3333"), "0420", 1000, "343", CurencyAbrEnum.UAH);

        //create ATM
        SystemMenuATM sysMenu = new SystemMenuATM(log);

        //start ATM
        sysMenu.startATM();

        //add cassette
        addMoneyInCassette(sysMenu);

        //add card in ATM
        sysMenu.getAtm().getCardAcceptor().takeCard(card);

    }



    /**
     *
     * @param sysMenu
     */
    public static void addMoneyInCassette(SystemMenuATM sysMenu) {
        sysMenu.getAtm().getCassette().addCurrency(new UAH(TypesCurencyEnum.HRIVNA, TypesFaceValueEnumUAH.fifty, CurencyAbrEnum.UAH), 100);
        sysMenu.getAtm().getCassette().addCurrency(new UAH(TypesCurencyEnum.HRIVNA, TypesFaceValueEnumUAH.oneHundred, CurencyAbrEnum.UAH), 100);
        sysMenu.getAtm().getCassette().addCurrency(new UAH(TypesCurencyEnum.HRIVNA, TypesFaceValueEnumUAH.twenty, CurencyAbrEnum.UAH), 100);
    }


}
