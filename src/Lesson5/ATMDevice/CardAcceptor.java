package Lesson5.ATMDevice;
/**
 * Клас описывающий работу картоприемника
 */
public class CardAcceptor {
    String name = null;

    public CardAcceptor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
