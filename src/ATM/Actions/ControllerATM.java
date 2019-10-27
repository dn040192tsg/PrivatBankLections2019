package ATM.Actions;

import ATM.ATMDevice.ATM;

import java.io.IOException;
import java.net.MalformedURLException;

public class ControllerATM extends Thread {

    ATM atm = null;
    ActionsMenuATM actionsMenuATM = null;

    public ControllerATM(String name, ATM atm) {
        super(name);
        this.atm = atm;
        actionsMenuATM = new ActionsMenuATM(atm);
    }


    @Override
    public void run() {

        atm.getDisplay().viewContent("=================================================================================\n" +
                "\n" +
                "Добро пожаловать в банкомат ПриватБанка. Вставьте карту в картоприемник\n" +
                "\n" +
                "=================================================================================");

        waitCard();

        while (atm.getCardAcceptor().getCard() != null && isInterrupted() == false) {
            try {
                atm.getDisplay().viewContent("=================================================================================\n" +
                        "\n" +
                        "Что-бы проверить баланс карты введите \"1\"\n" +
                        "Что-бы снять деньги с карты введите \"2\"\n" +
                        "Что-бы узнать курс валют введите \"3\"\n" +
                        "\n" +
                        "Чтобы завршить работу введите \"Return\"\n" +
                        "\n" +
                        "=================================================================================\n" +
                        "Введите команду и нажмите Enter:");

                switch (atm.getKeyboard().readInput()) {
                    case "1":
                        checkBalanceMenu();
                        break;
                    case "2":
                        outMoneyMenu();
                        break;
                    case "3":
                        exchengeRatesMenu();
                        break;
                    case "Return":
                        atm.getCardAcceptor().pushCard();
                        break;
                    default:
                        atm.getDisplay().viewContent("В банкомате нет такой команды");

                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (
                    MalformedURLException e) {
                e.printStackTrace();
            } catch (
                    IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void checkBalanceMenu() throws NullPointerException, IllegalArgumentException, InterruptedException {

        atm.getDisplay().viewContent(actionsMenuATM.checkBalance() + " \n Для возврата в главное меню введите return");

        while (!atm.getKeyboard().readInput().equals("Return")) {
            atm.getDisplay().viewContent("Для возврата в главное меню введите return");
        }


    }

    public void exchengeRatesMenu() throws IOException, InterruptedException {

        atm.getDisplay().viewContent(actionsMenuATM.ExchengeRates() + " \n Для возврата в главное меню введите return");

        while (!atm.getKeyboard().readInput().equals("Return")) {
            atm.getDisplay().viewContent("Для возврата в главное меню введите return");
        }

    }

    public void outMoneyMenu() throws NullPointerException, IllegalArgumentException, InterruptedException {

        if (atm.getCassette().affordableCash() != 0) {

            atm.getDisplay().viewContent("Доступные купюры для снятия - " + atm.getCassette().sumCurrency() +
                    "\n Введите сумму для снятия и нажмите Enter или Return для возврата в главное меню");

            String comand = "return";

            while (!(comand = atm.getKeyboard().readInput()).equals("Return")) {
                if (comand.matches("^[1-9]\\d+")) {
                    int sumPush = Integer.parseInt(comand);
                    if (atm.getCardAcceptor().getCard().getBalance() > sumPush) {
                        if (atm.getCassette().affordableCash() > sumPush) {
                            if (atm.getCassette().availableCurrency(sumPush)) {
                                String result = actionsMenuATM.outMoney(sumPush);
                                atm.getDisplay().viewContent("Получите деньги - " + sumPush + " " + atm.getCassette().getCassetCuerrency() + "\n" + result +
                                        "\n Для возврата в главное меню введите Return");
                                while (!atm.getKeyboard().readInput().equals("Return")) {
                                    atm.getDisplay().viewContent("Для возврата в главное меню введите return");
                                }
                                break;
                            } else {
                                atm.getDisplay().viewContent("Доступные купюры для снятия - " + atm.getCassette().sumCurrency() +
                                        "\n Введите сумму для снятия кратную " + atm.getCassette().sumCurrency() + " \n или return для возврата в главное меню");
                            }
                        } else {
                            atm.getDisplay().viewContent("В банкомате недостаточно средств, доступная сумма " + atm.getCassette().affordableCash()
                                    + " \n Введите сумму для снятия или return для возврата в главное меню");
                        }
                    } else {
                        atm.getDisplay().viewContent("На карте недостаточно средств, баланс карты - " + atm.getCardAcceptor().getCard().getBalance() +
                                " \n Введите сумму для снятия или return для возврата в главное меню");
                    }

                } else {
                    atm.getDisplay().viewContent("В банкомате нет такой команды" + " Доступные купюры для снятия - " +
                            atm.getCassette().sumCurrency() + "\n Введите сумму для снятия или return для возврата в главное меню");

                }
            }
        } else {
            atm.getDisplay().viewContent("В банкомате недостаточно средств, доступная сумма " + atm.getCassette().affordableCash());
        }
    }

    public void waitCard() {

        while (atm.getCardAcceptor().getCard() == null) {
            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        atm.getDisplay().viewSystemContent("Card added is being read .." + atm.getCardAcceptor().readCard());

    }

}
