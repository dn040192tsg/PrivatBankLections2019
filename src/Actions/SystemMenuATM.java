package Actions;

import ATMDevice.*;
import Currencys.CurrencyEnum.CurencyAbrEnum;
import Interface.SwingInterface;

import java.util.Objects;
import java.util.logging.Logger;

/**
 * This class create ATM and start,stop and rebut work thread ATM
 */
public class SystemMenuATM {

    /**
     * Param link object class ATM
     *
     * @see ATM
     */
    ATM atm = null;
    /**
     * Param link object class ControllerATM
     *
     * @see ControllerATM
     */
    ControllerATM controllerATM = null;
    /**
     * Param link object class SwingInterface
     *
     * @see SwingInterface
     */
    SwingInterface swingInterface = new SwingInterface();

    static Logger log = null;

    /**
     * Constructor the designer who creates a new ATM class ATM
      * @param log
     */
    public SystemMenuATM(Logger log) {
        this.log = log;
        atm = new ATM(new CardAcceptor("CardAcceptor"),
                new Printer("Printer"),
                new Cassette("Cassette", CurencyAbrEnum.UAH),
                new Display("Display", swingInterface),
                new Keyboard("Keyboard", swingInterface));

    }

    /**
     * The method creates the controller class and starts the ATM workflow
     */
    public void startATM() {

        atm.getDisplay().viewSystemContent("Download, pleace wait..");
        controllerATM = new ControllerATM("Thread1", atm);
        controllerATM.start();
    }

    /**
     * method stop work ATM
     */
    public void stopAtm() {

    }

    /**
     * rebut ATM
     */
    public void rebutATM() {

    }

    /**
     * getter
     * @return link class ATM
     */
   public ATM getAtm() {
        return atm;
    }

    /**
     * setter
     * @param atm link class ATM
     */
    private void setAtm(ATM atm) {
        this.atm = atm;
    }

    /**
     * getter
     * @return link object controllerATM
     */
    public ControllerATM getcontroller() {
        return controllerATM;
    }

    /**
     * setter
     * @param controllerATM link object controllerATM
     */
    private void setcontroller(ControllerATM controllerATM) {
        this.controllerATM = controllerATM;
    }

    /**
     *
     * @param o some object
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SystemMenuATM)) return false;
        SystemMenuATM that = (SystemMenuATM) o;
        return Objects.equals(getAtm(), that.getAtm()) &&
                Objects.equals(controllerATM, that.controllerATM) &&
                Objects.equals(swingInterface, that.swingInterface);
    }
/**
 * @return Objects.hash(getAtm(), controllerATM, swingInterface)
 */
    @Override
    public int hashCode() {
        return Objects.hash(getAtm(), controllerATM, swingInterface);
    }

    /**
     *
     * @return  String field object
     *
     */
    @Override
    public String toString() {
        return "SystemMenuATM{" +
                "atm=" + atm +
                ", controllerATM=" + controllerATM +
                ", swingInterface=" + swingInterface +
                '}';
    }
}
