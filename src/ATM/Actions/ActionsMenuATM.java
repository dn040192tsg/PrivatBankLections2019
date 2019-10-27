package ATM.Actions;

import ATM.ATMDevice.ATM;
import ATM.Bills.Card;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ActionsMenuATM implements Actions {

    ATM atm = null;

    public ActionsMenuATM(ATM atm) {
        this.atm = atm;
    }

    @Override
    public String checkBalance() throws NullPointerException {

        if (atm.getCardAcceptor().getCard() != null) {
            Card card = atm.getCardAcceptor().readCard();
            return  card.getCardNumber() + ": " + card.getBalance() + " " + card.getCurency();
        } else {
            throw new NullPointerException("Нет карты в картоприемнике");
        }

    }

    @Override
    public String outMoney(int sum) throws NullPointerException{
        String result;
        if (atm.getCardAcceptor().getCard() != null) {
            Card card = atm.getCardAcceptor().readCard();
            card.debitCard(sum);
            result = atm.getCassette().debitCassete(sum);
        } else {
            throw new NullPointerException("Нет карты в картоприемнике");
        }

        return result;
    }

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
}
