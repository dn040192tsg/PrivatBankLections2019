package Lesson4;


import java.util.Arrays;

public class ArraysHW {


    public void numberArray() {

      int [] array = new int[]{1, 2, 3};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public void stringArray() {

       String [] array = new String[]{"a", "b", "c"};
        for (String x : array) {
            System.out.println(x);
        }

    }

    public void charArray() {

        char [] array = new char []{'a', 'b', 'c'};

        int count = 0;

        do {
            System.out.println(array[count]);
            count++;
        }
        while (count < array.length);
    }


    public void doubleArray() {

        Double [] array = new Double[]{1.11, 2.22, 3.33};
        int count = 0;
        while (count < array.length){
            System.out.println(array[count]);
            count++;
        }
    }


    public  void twoDimensional() {

        int [][] array = new int[][]{{1, 2, 3}, {1, 2, 3}};
        for (int [] x : array) {
            System.out.println(Arrays.toString(x));
        }
    }



    public void jaggedArray() {

        Integer[][] array = new Integer[][]{{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};

        for (int index = 0; index < array.length; index++) {
            System.out.println(Arrays.toString(array[index]));
        }
    }



}
