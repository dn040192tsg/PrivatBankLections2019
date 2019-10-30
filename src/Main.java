import Actions.SystemMenuATM;
import Bills.Card;
import Bills.MagnitCardPrivatBank;
import Bills.PinCode;
import Currencys.CurrencyEnum.CurencyAbrEnum;
import Currencys.CurrencyEnum.TypesCurencyEnum;
import Currencys.CurrencyEnum.TypesFaceValueEnumUAH;
import Currencys.UAH;

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
     * dd money in cassette ATM
     * @param sysMenu
     */
    public static void addMoneyInCassette(SystemMenuATM sysMenu) {
        sysMenu.getAtm().getCassette().addCurrency(new UAH(TypesCurencyEnum.HRIVNA, TypesFaceValueEnumUAH.fifty, CurencyAbrEnum.UAH), 100);
        sysMenu.getAtm().getCassette().addCurrency(new UAH(TypesCurencyEnum.HRIVNA, TypesFaceValueEnumUAH.oneHundred, CurencyAbrEnum.UAH), 100);
        sysMenu.getAtm().getCassette().addCurrency(new UAH(TypesCurencyEnum.HRIVNA, TypesFaceValueEnumUAH.twenty, CurencyAbrEnum.UAH), 100);
    }


}
