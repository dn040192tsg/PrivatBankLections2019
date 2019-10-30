package ATM.ATMDevice;

import ATM.Interface.SwingInterface;

import java.util.Objects;
import java.util.Scanner;
import static java.lang.Thread.sleep;

/**
 * Class used Scanner for read console input or SwingInterface for interface interface
 */
public class Keyboard  {
    /**
     * Name device
     */
    String name;
    /**
     * Scanner
     */
    Scanner scan ;
    /**
     * link object SwingInterface if equals null used console interface
     */
    SwingInterface swingInterface;

    /**
     * Constructor initialization Scaner or SwingInterface
     * @param name
     * @param swingInterface
     */
    public Keyboard(String name, SwingInterface swingInterface) {
        this.name = name;
        if (swingInterface == null) {
            scan = new Scanner(System.in);
        }else{
            this.swingInterface = swingInterface;
        }
    }

    /**
     * Method read input console or swing interface
     * @return
     * @throws InterruptedException
     */
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

    /**
     * Standart getter
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Standart setter
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Standart getter
     * @return SwingInterface
     */
    public SwingInterface getSwingInterface() {
        return swingInterface;
    }

    /**
     * Standart setter
     * @param swingInterface
     */
    public void setSwingInterface(SwingInterface swingInterface) {
        this.swingInterface = swingInterface;
    }

    /**
     * equals
     * @param o some object
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Keyboard)) return false;
        Keyboard keyboard = (Keyboard) o;
        return Objects.equals(getName(), keyboard.getName()) &&
                Objects.equals(scan, keyboard.scan) &&
                Objects.equals(getSwingInterface(), keyboard.getSwingInterface());
    }

    /**
     * hashCode
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(getName(), scan, getSwingInterface());
    }
}
