package ATM.ATMDevice;

import java.util.Objects;

/**
 * Class output chek for transactions
 */
public class Printer {
    /**
     * name device
     */
    String name = null;

    /**
     * Constructor
     * @param name name device
     */
    public Printer(String name) {
        this.name = name;
    }

    /**
     * Method print chek
     * @param msg
     */
    public void printCheck(String msg){

    }

    /**
     * Standart getter
     * @return
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
     * toString
     * @return
     */
    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                '}';
    }

    /**
     * equals
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Printer)) return false;
        Printer printer = (Printer) o;
        return Objects.equals(getName(), printer.getName());
    }

    /**
     * hashCode
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
