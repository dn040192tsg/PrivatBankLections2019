package Lesson5.Bills;

/**
 * Клас описывающий работу пин кода
 */
public class PinCode {

    int pin = 0;

    public PinCode(int pin) {
        setPin(pin);
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin){
        if (Integer.toString(pin).length() == 4){
            this.pin = pin;
        }else {
            System.out.println("Ошибка пин код карты должен быть 4 цифр");
        };    }

    @Override
    public String toString() {
        return "PinCode{" +
                "pin=" + pin +
                '}';
    }
}
