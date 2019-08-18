package Lesson5.ATMDevice;

/**
 * Класс описывающий класс принтер
 */
public class Printer {

    String name = null;

    public Printer(String name) {
        this.name = name;
    }

    public void printCheck(String msg){
        System.out.println(msg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                '}';
    }
}
