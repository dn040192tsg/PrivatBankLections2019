package Lesson6;

public class Example {

    public void print (){

        Inner tmp = new Inner();

        System.out.println(tmp.a);
        System.out.println(tmp.b);
        System.out.println(tmp.c);
    }


    class Inner {
        String a = "str1";
        String b = "str2";
        String c = "str3";
    }
}
