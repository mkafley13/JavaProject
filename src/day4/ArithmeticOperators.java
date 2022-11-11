package day4;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int a = 6;
        int b = 5;

        add(a,b);

        int i = 5;

        i+= 2; // i = i+2
        // i++ - pre (adds after) or ++i - post (adds first) = i+1

        System.out.println(i);
    }
    public static void add(int a, int b) {

        float c = (float) a / b;

        int result = (int) c;

        System.out.println(c);
        System.out.println(result);
    }
}
