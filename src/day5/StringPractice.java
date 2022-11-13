package day5;

public class StringPractice {

    public static void main(String[] args) {

        String name1 = new String("abc");
        String name2 = "abc";
        String name3 = "abcde";

        boolean isNameSame = name1 == name2;
        System.out.println(isNameSame); // not same because using new function creates a new memory location

        String sub = name3.substring(0,3);
        System.out.println(sub);

        boolean isNameSame1 = name2.equals(sub); //Use this to check for String not ==
        System.out.println(isNameSame1);

        //String greeting = "Hello Manoj, Good Morning";
        String name = "ABC";

        String message = "Hello " + name + ", Good Morning";
        System.out.println(message);

        String message1 = "Hello " .concat(name).concat(", Good Morning");
        System.out.println(message1);

        String message2 = String.format("Hello %s, Good Morning", name);
        System.out.println(message2);

        StringBuilder builder = new StringBuilder();
        builder.append("Hello ");
        builder.append(name);
        builder.append(", Good Morning");

        String message3 = builder.toString();
        System.out.println(message3);

    }
}
