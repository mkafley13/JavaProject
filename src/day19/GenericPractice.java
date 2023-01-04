package day19;

import java.util.Arrays;

public class GenericPractice {

    public static void main(String[] args) {

        Pair<String, String> namePair = new Pair<>("name","Manoj");
        Pair<String,Integer> agePair = new Pair<>("age",20);
        Pair<String,Boolean> presentPair = new Pair<>("isPresent",true);
        Pair<Integer, String> numberPair = new Pair<>(10,"Ten");

        String name = namePair.getValue();
        Integer age = agePair.getValue();

        int number = numberPair.getKey(); //Auto unboxing

        Integer[] numbers = {2,3,4,5};
        printArray(numbers);

        Float[] number1 = {2f,3f,4f,5f};
        printArray(number1);

        String[] names = {"A","B","C"};
        printArray(names);

        Test[] tests ={new Test(),new Test(), new Test()};

        maximum(1,2,3);
        maximum("A","B","C");
        //maximum(new Test(), new Test(), new Test());

        if (presentPair instanceof Pair){

        }
    }
    public static <T> void printArray(T[] numbers){
       System.out.println(Arrays.toString(numbers));
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
