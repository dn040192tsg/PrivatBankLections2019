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


    private static final Logger log = Logger.getLogger(Main.class.getName());



    public static void main(String[] args) throws IOException {

       LogManager.getLogManager().readConfiguration(Main.class.getResourceAsStream("Log.properties"));

        // создаем карту приватбанка
        Card card = new MagnitCardPrivatBank("4149121223344559", new PinCode("3333"), "0420", 1000, "343", CurencyAbrEnum.UAH);

        //создаемАТМ
        SystemMenuATM sysMenu = new SystemMenuATM();

        //запускаем банкомат
        sysMenu.startATM(false);

        //заправляем кассету деньгами
        addMoneyInCassette(sysMenu);

        //вствляем карту в картоприемник банкомата
        sysMenu.getAtm().getCardAcceptor().takeCard(card);


//        JFrame jFrame = new JFrame(){};
//        jFrame.setVisible(true);
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.setTitle("MyATM");
//        jFrame.setBounds(500,0,500,300);



//        Person p = new Person("Stas", 16);
//
//        FileOutputStream outputStream = new FileOutputStream("save.ser");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//
//        // сохраняем игру в файл
//        objectOutputStream.writeObject(p);
//
//        //закрываем поток и освобождаем ресурсы
//        objectOutputStream.close();
//
//        FileInputStream fileInputStream = new FileInputStream("save.ser");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//        Person p1 = null;
//        try {
//            p1 = (Person) objectInputStream.readObject();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(p1);
    }


    public static void addMoneyInCassette(SystemMenuATM sysMenu) {
        sysMenu.getAtm().getCassette().addCurrency(new UAH(TypesCurencyEnum.HRIVNA, TypesFaceValueEnumUAH.fifty, CurencyAbrEnum.UAH), 100);
        sysMenu.getAtm().getCassette().addCurrency(new UAH(TypesCurencyEnum.HRIVNA, TypesFaceValueEnumUAH.oneHundred, CurencyAbrEnum.UAH), 100);
        sysMenu.getAtm().getCassette().addCurrency(new UAH(TypesCurencyEnum.HRIVNA, TypesFaceValueEnumUAH.twenty, CurencyAbrEnum.UAH), 100);
    }


    public int sum (int a, int b){
        return a+b;
    }
}
