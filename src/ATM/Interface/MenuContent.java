package ATM.Interface;

import ATM.ATMDevice.ATM;

public class MenuContent  {

    ATM atm = null;
    String name = null;

    public MenuContent(ATM atm) {
        this.atm = atm;
    }

    public MenuContent(ATM atm, String name) {
        this.atm = atm;
        this.name = name;
    }

    public MenuContent() {

    }

    public String welcomeMenu() {

        return "Приветствуем в банкомате ПриватБанка";
    }

    public String mainMenu() {

        return "Главное меню";
    }


}
