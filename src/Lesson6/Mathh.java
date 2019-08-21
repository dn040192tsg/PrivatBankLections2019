package Lesson6;

public class Mathh {

    public static  Factorial getFactorial(int x){
        int result = 1;

        for (int i = 0; i <= x; i++) {
            result *= x;
        }

        return new Factorial(result, x);
    }

    public static class Factorial{
        int result;
        int key;

        public Factorial(int result, int key) {
            this.result = result;
            this.key = key;
        }

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }
    }
}
