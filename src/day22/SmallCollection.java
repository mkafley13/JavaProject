package day22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SmallCollection {

    public static void main(String[] args) {

        ArrayList<String> nameArray = new ArrayList<>();
        nameArray.add("A");
        nameArray.add("B");
        nameArray.add("C");

        String maxString = Collections.max(nameArray);
        System.out.println(maxString);

        System.out.println(nameArray);

        listModifying(nameArray);
        System.out.println(nameArray);

       // Collections.unmodifiableList(nameArray); same as below
        List<String> names = List.copyOf(nameArray);

        Map<String, Integer> scores = Map.of("Mike", 1, "Ben", 3,"Sam", 2);


        ArrayList<String> name = new ArrayList<>();
        name.add("A");
        name.add("B");
        name.add("C");
        name.add("D");
        name.add("E");

        int index = Collections.binarySearch(name, "D");

        if (index >=0){
            System.out.println(index);
        }
        else {
            System.out.println("Not found in list");
        }

        Collections.reverse(name);
        System.out.println(name);
    }

    public static void listModifying(ArrayList<String> list){
        list.add("D");
    }
}
