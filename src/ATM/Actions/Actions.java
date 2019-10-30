package ATM.Actions;
import java.io.IOException;

/**
 * Interface actions ATM
 */
public interface Actions {

     /**
      * Check balance card. Method checks how much money is on the user's card
      * @return balance card some String value
      */
     String checkBalance();

     /**
      * Out money ATM. Method withdraws money from the user's card and from the cassette of the ATM
      * @param sum some sum type user
      * @return  String what denominations issued money
      */
     String outMoney(int sum);

     /**
      * Chek exchengeRates. Method checks the current rate of the private bank
      * @return some string value exchenge rates
      * @throws IOException
      */
     String ExchengeRates() throws IOException;



}
