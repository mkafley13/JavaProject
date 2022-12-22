package day14;

import java.util.Arrays;

public class SpecialParameter {

    public static void main(String[] args) {

        String message = String.format("Hello %s, welcome to our website. You get free balance of $%d. Thank you for registering", "Manoj",100);
        System.out.println(message);

        add(2,4);
    }
    public static void add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number; // sum = sum + number
            
        }
        
        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);
    }
}
