package ATM.ATMDevice;

import ATM.Interface.SwingInterface;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Keyboard  {

    String name;
    Scanner scan ;
    SwingInterface swingInterface;

    public Keyboard(String name, SwingInterface swingInterface) {
        this.name = name;
        if (swingInterface == null) {
            scan = new Scanner(System.in);
        }else{
            this.swingInterface = swingInterface;
        }
    }

    public String readInput () throws InterruptedException {
        if (swingInterface != null){
            String answer = null;
            while((answer = swingInterface.getReadBuffer()) == null){
                sleep(200);
            }
            return answer;
        }

        return scan.nextLine();
    }

}
