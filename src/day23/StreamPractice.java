package day23;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamPractice {

    public static void main(String[] args) {

        ArrayList<String> nameArray = new ArrayList<>();
        nameArray.add("A");
        nameArray.add("B");
        nameArray.add("C");
        nameArray.add("D");
        nameArray.add("E");

        //When one operation has no link to other operation and can be random then use Parallel Stream
        //Multiple data pass at the same time so the outcome is random

        Stream<String> nameStream = nameArray.stream(); //Converting Array to Stream

        Stream<Integer> intStream = Stream.of(1, 2, 7, 4, 5, 5, 7, 2); //making a Stream right away

        List<String> collectedName =
                nameStream.peek(System.out::println)
                        .collect(Collectors.toList());

        System.out.println(collectedName);

        //List<String> collectedName = nameStream.peek(name -> System.out.println(name)).collect(Collectors.toList());

        List<Integer> collectInteger =
                intStream.peek(System.out::println)
                        .filter(intValue -> intValue % 2 == 0) //passes even number (if it's divided by 2 and reminder is 0
                        .map(intValue -> intValue * 10)
                        .peek(System.out::println)
                        .collect(Collectors.toList());

        System.out.println(collectInteger);

        long countOfEven =
                intStream.peek(System.out::println)
                        .filter(intValue -> intValue % 2 == 0)
                        .count();

        System.out.println(countOfEven);

        List<Integer> sortedValue = intStream
                        .distinct() // Only have 1 of each number
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());

    }
}
