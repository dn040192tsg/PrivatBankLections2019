package ATM.Actions;

import ATM.ATMDevice.ATM;
import ATM.Bills.Card;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/**
 * This class describes function ATM, check balance, out money and exchenge rates
 */
public class ActionsMenuATM implements Actions {
    /**
     * Param link object class ATM
     */
    ATM atm = null;

    /**
     * Constructor
     * @param atm Param link object class ATM
     */
    public ActionsMenuATM(ATM atm) {
        this.atm = atm;
    }

    /**
     * @see Actions#checkBalance()
     * @return
     * @throws NullPointerException
     */
    @Override
    public String checkBalance() throws NullPointerException {

        if (atm.getCardAcceptor().getCard() != null) {
            Card card = atm.getCardAcceptor().readCard();
            return  card.getCardNumber() + ": " + card.getBalance() + " " + card.getCurency();
        } else {
            throw new NullPointerException("dont card in cardaceptor");
        }

    }

    /**
     * @see Actions#outMoney(int) ()
     * @param sum some sum type user
     * @return
     * @throws NullPointerException
     */
    @Override
    public String outMoney(int sum) throws NullPointerException{
        String result;
        if (atm.getCardAcceptor().getCard() != null) {
            Card card = atm.getCardAcceptor().readCard();
            card.debitCard(sum);
            result = atm.getCassette().debitCassete(sum);
        } else {
            throw new NullPointerException("dont card in cardaceptor");
        }

        return result;
    }

    /**
     * @see Actions#ExchengeRates()
     * @return some string value exchenge rates
     * @throws IOException
     */
    @Override
    public String ExchengeRates() throws IOException {

        String result = "";
        URL pb = null;
        pb = new URL("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
        URLConnection yc = pb.openConnection();

        try (BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()))) {

            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                result += inputLine;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * Standart method toString
     * @return
     */
    @Override
    public String toString() {
        return "ActionsMenuATM{" +
                "atm=" + atm +
                '}';
    }

    /**
     * equals
     * @param o some object
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ActionsMenuATM)) return false;
        ActionsMenuATM that = (ActionsMenuATM) o;
        return Objects.equals(atm, that.atm);
    }

    /**
     * hashCode
     * @return Objects.hash(atm)
     */
    @Override
    public int hashCode() {
        return Objects.hash(atm);
    }
}
