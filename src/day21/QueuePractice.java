package day21;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueuePractice {

    public static void main(String[] args) {

        ArrayDeque<String> userNames = new ArrayDeque<>();
        userNames.add("Ram");
        userNames.add("Sam");

        System.out.println(userNames);

        userNames.addFirst("Manoj");
        System.out.println(userNames);

        System.out.println(userNames.peek()); //gives only first data without removing

        System.out.println(userNames.pop()); //gives only first data and removes that data


        PriorityQueue<String> userNames1 = new PriorityQueue<>();
        userNames1.add("Ram");
        userNames1.add("Sam");
        userNames1.add("Manoj");

        System.out.println(userNames1);

        System.out.println(userNames1.peek());

        System.out.println(userNames1.poll()); //gives only first data and removes that data
        System.out.println(userNames1);

        for (String name : userNames1){
            System.out.println(name);
        }
    }
}
