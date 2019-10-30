package Bills;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class describes pin code
 */
public class PinCode implements Serializable {

    /**
     * Pincode only 4 number
     */
    String pin;

    /**
     * Serilization
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor
     * @param pin
     */
    public PinCode(String pin) {
        this.pin = pin;
    }

    /**
     * Get pin
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * Chek regular "\\d{4}" and set new pin
     * @param pin
     * @throws IllegalArgumentException
     */
    public void setPin(String pin) throws IllegalArgumentException {
        if (pin.matches("\\d{4}")) {
            this.pin = pin;
        } else {
            throw new IllegalArgumentException("Error pin card code must be 4 digits");
        }
    }

    /**
     * equals
     *
     * @param o
     * @return Objects.equals(getPin (), pinCode.getPin()
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PinCode)) return false;
        PinCode pinCode = (PinCode) o;
        return Objects.equals(getPin(), pinCode.getPin());
    }

    /**
     * hashCode
     *
     * @return hashCode
     */
    @Override
    public int hashCode() {
        return Objects.hash(getPin());
    }

    /**
     * toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "PinCode{" +
                "pin='" + pin + '\'' +
                '}';
    }
}
