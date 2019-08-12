package Lesson2;

/**
 * Программа которая выводит приветствие миру
 */


public class HomeWork {

    public static void main(String[] agrs) { // основной метод

        System.out.println("Hello World!");

        //создаем разные переменные
        byte  a = 17;
        short b = 32767;
        int   c = 20;
        long  d = -364775808;

        float  e = (float) 0.4;
        double f = 3.888;

        char g = 'e';


        boolean h = true;
        boolean i = false;

        //пробуем разные операции

        System.out.println(a + " + " + b + " = " + a+b);
        System.out.println(a + " * " + b + " = " + a*b);
        System.out.println(b + " % " + a + " = " + b%a);
        System.out.println(a + " ++ " + " = " + ++a);
        System.out.println(c + " >> 2  = " + (c >> 2));



    }

}