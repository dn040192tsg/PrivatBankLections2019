package ATM.Actions;

import java.io.IOException;

public interface Actions {

     String checkBalance();

     String outMoney(int sum);

     String ExchengeRates() throws IOException;



}
