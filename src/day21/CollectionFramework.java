package day21;

import java.util.*;

public class CollectionFramework {

    public static void main(String[] args) {

        List<String> lists = new LinkedList<>();

        lists.add("A");
        lists.add("B");
        lists.add("C");
        lists.add("D");
        lists.add("F");

        lists.add(0,"Z");
        System.out.println(lists);

        Set<String> stringSet = new TreeSet<>();

        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("D");
        stringSet.add("F");
        stringSet.add("F");
        stringSet.add("F");

        //stringSet.add(0,"Z"); Can not as it is sorted

        System.out.println(stringSet.add("F")); //ture
        System.out.println(stringSet.add("F")); //false
        System.out.println(stringSet.add("F")); //false. Does not allow duplicate

    }
}
