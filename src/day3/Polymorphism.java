package day3;

public class Polymorphism {

    public static void main(String[] args) {
      add(2,5);
      add(2f,5f);
      add(2.0, 5.0);
    }
    public static void add(int a, int b){
        int temp = a + b;
        System.out.println(temp);

    }

    public static void add(float a, float b){
        float temp = a + b;
        System.out.println(temp);

    }

    public static void add(Double a, Double b){
        Double temp = a + b;
        System.out.println(temp);

    }
}
