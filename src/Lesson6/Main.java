package Lesson6;


public class Main {

    public static void main(String[] args) {
        Example ex = new Example();
        ex.print();

        Mathh math = new Mathh();
        System.out.println(math.getFactorial(2).result);

        Worker work = new Worker();
        Person person = new Worker();

        System.out.println(work instanceof Person);
        System.out.println(work.getClass().getName());
    }


}
