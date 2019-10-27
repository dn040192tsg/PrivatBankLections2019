package ATM.Bills;

import java.io.Serializable;
import java.util.Objects;

/**
 * Клас описывающий работу пин кода
 */
public class PinCode implements Serializable {

    String pin;
    private static final long serialVersionUID = 1L;

    public PinCode(String pin) {
        setPin(pin);
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) throws IllegalArgumentException {
        if (pin.matches("\\d{4}")) {
            this.pin = pin;
        } else {
            throw new IllegalArgumentException("Ошибка пин код карты должен состоять из 4 цифр");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PinCode)) return false;
        PinCode pinCode = (PinCode) o;
        return Objects.equals(getPin(), pinCode.getPin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPin());
    }

    @Override
    public String toString() {
        return "PinCode{" +
                "pin='" + pin + '\'' +
                '}';
    }
}
