package ATM.Actions;

import ATM.ATMDevice.ATM;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 * This class is a separate stream and controls all the functions of the menu and devices of the ATM
 */
public class ControllerATM extends Thread {
    /**
     * Param link object class ATM
     *
     * @see ATM
     */
    ATM atm = null;
    /**
     * Param link object class ATM
     *
     * @see ActionsMenuATM
     */
    ActionsMenuATM actionsMenuATM = null;

    /**
     * Constructor class ControllerATM. This class extends Thread
     *
     * @param name Name this thread
     * @param atm  Param link object class ATM
     */
    public ControllerATM(String name, ATM atm) {
        super(name);
        this.atm = atm;
        actionsMenuATM = new ActionsMenuATM(atm);
    }

    /**
     * This method controls the ATM and its menu decides on the launch of the ATM functions
     */
    @Override
    public void run() {

        atm.getDisplay().viewContent("=================================================================================\n" +
                "\n" +
                "Welcome to the PrivatBank ATM. Insert the card into the card reader \n" +
                "\n" +
                "=================================================================================");

        waitCard(); //wait until the user inserts a map

        while (atm.getCardAcceptor().getCard() != null && isInterrupted() == false) {
            try {
                atm.getDisplay().viewContent("==================================================================================== \n " +
                        "\n" +
                        "To check the card balance, enter  1  \n" +
                        "To withdraw money from the card, enter  2  \n" +
                        "To find out the exchange rate, enter  3  \n" +
                        "\n" +
                        "To end the job, enter  Return  \n" +
                        "\n" +
                        "==================================================================================== \n " +
                        "Type a command and press Enter:"
                );
                //menu button handling

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
                        atm.getDisplay().viewContent("There is no such command at the ATM\n");

                }
            } catch (NullPointerException e) {
                SystemMenuATM.log.warning(e.getMessage());
            } catch (IllegalArgumentException e) {
                SystemMenuATM.log.warning(e.getMessage());
            } catch (MalformedURLException e) {
                SystemMenuATM.log.warning(e.getMessage());
            } catch (IOException e) {
                SystemMenuATM.log.warning(e.getMessage());
            } catch (InterruptedException e) {
                SystemMenuATM.log.warning(e.getMessage());
            }
        }
    }

    /**
     * This method controls the ATM function check balance
     * @throws NullPointerException
     * @throws IllegalArgumentException
     * @throws InterruptedException
     */
    public void checkBalanceMenu() throws NullPointerException, IllegalArgumentException, InterruptedException {

        atm.getDisplay().viewContent(actionsMenuATM.checkBalance() + " \n To return to the main menu, enter return\n");

        while (!atm.getKeyboard().readInput().equals("Return")) {
            atm.getDisplay().viewContent("To return to the main menu, enter return\n");
        }


    }

    /**
     * This method controls the ATM function exchenge rates
     * @throws IOException
     * @throws InterruptedException
     */
    public void exchengeRatesMenu() throws IOException, InterruptedException {

        atm.getDisplay().viewContent(actionsMenuATM.ExchengeRates() + " \n To return to the main menu, enter return\n");

        while (!atm.getKeyboard().readInput().equals("Return")) {
            atm.getDisplay().viewContent("To return to the main menu, enter return\n");
        }

    }

    /**
     * This method controls the ATM function out money
     * @throws NullPointerException
     * @throws IllegalArgumentException
     * @throws InterruptedException
     */
    public void outMoneyMenu() throws NullPointerException, IllegalArgumentException, InterruptedException {

        if (atm.getCassette().affordableCash() != 0) {

            atm.getDisplay().viewContent("Available withdrawals - " + atm.getCassette().sumCurrency() +
                    "Enter the amount to withdraw and press Enter or Return to return to the main menu.");

            String comand = "return";

            while (!(comand = atm.getKeyboard().readInput()).equals("Return")) {
                if (comand.matches("^[1-9]\\d+")) {
                    int sumPush = Integer.parseInt(comand);
                    if (atm.getCardAcceptor().getCard().getBalance() > sumPush) {
                        if (atm.getCassette().affordableCash() > sumPush) {
                            if (atm.getCassette().availableCurrency(sumPush)) {
                                String result = actionsMenuATM.outMoney(sumPush);
                                atm.getDisplay().viewContent("Get the money - " + sumPush + " " + atm.getCassette().getCassetCuerrency() + "\n" + result +
                                        "\n To return to the main menu, enter Return");
                                while (!atm.getKeyboard().readInput().equals("Return")) {
                                    atm.getDisplay().viewContent("To return to the main menu, enter Return");
                                }
                                break;
                            } else {
                                atm.getDisplay().viewContent("Available withdrawals - " + atm.getCassette().sumCurrency() +
                                        "\n Enter the amount to withdraw multiple " + atm.getCassette().sumCurrency() + " or return to return to the main menu");
                            }
                        } else {
                            atm.getDisplay().viewContent("There are not enough funds at the ATM, available amount " + atm.getCassette().affordableCash()
                                    + " \n Enter the amount to withdraw or return to return to the main menu");
                        }
                    } else {
                        atm.getDisplay().viewContent("There are not enough funds on the card, card balance - " + atm.getCardAcceptor().getCard().getBalance() +
                                " \n Enter the amount to withdraw or return to return to the main menu");
                    }

                } else {
                    atm.getDisplay().viewContent("There is no such command at the ATM" + " Available withdrawals - " +
                            atm.getCassette().sumCurrency() + "\n Enter the amount to withdraw or return to return to the main menu");

                }
            }
        } else {
            atm.getDisplay().viewContent("Error pin card code must be 4 digits " + atm.getCassette().affordableCash());
        }
    }

    /**
     * This method wait for user inssert card
     */
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
