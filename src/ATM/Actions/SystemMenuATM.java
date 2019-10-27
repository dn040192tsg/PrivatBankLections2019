package ATM.Actions;

import ATM.ATMDevice.*;
import ATM.Currencys.CurrencyEnum.CurencyAbrEnum;
import ATM.Interface.AudioTrack;
import ATM.Interface.SwingInterface;


public class SystemMenuATM {

    ATM atm = null;
    ControllerATM controllerATM = null;
    SwingInterface swingInterface = new SwingInterface();


    public SystemMenuATM() {

        atm = new ATM(new CardAcceptor("Картоприемник"),
                new Printer("Принтер"),
                new Cassette( "Касета", CurencyAbrEnum.UAH),
                new Display("Дисплей",swingInterface),
                new Keyboard("Клавиатура", swingInterface));

    }

    public void startATM(boolean audio) {

        atm.getDisplay().viewSystemContent("Download, pleace wait..");
        controllerATM = new ControllerATM("Поток1", atm);
        atm.setStatusWork(true);
        controllerATM.start();

        if (audio == true){
            new AudioTrack().start();
        }



    }





    public void stopAtm() {

        atm.setStatusWork(false);

    }

    public void rebutATM() {



    }

    public ATM getAtm() {
        return atm;
    }

    public void setAtm(ATM atm) {
        this.atm = atm;
    }

    public ControllerATM getcontroller() {
        return controllerATM;
    }

    public void setcontroller(ControllerATM controllerATM) {
        this.controllerATM = controllerATM;
    }


}
