package day5;

import java.util.Objects;

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

        String year = "2022";
        String month = "11";
        String day = "12";

        String all = String.join("-", month, day, year);
        System.out.println(all);

        int n = 5;
        String repeated = "Java".repeat(n);
        System.out.println(repeated);

        char c = repeated.charAt(2);
        System.out.println(c);

        int result = "AbC".compareToIgnoreCase("aac");
        System.out.println(result);

        String lower = "AbCDe".toLowerCase(); //abcde

        Boolean isAvailable = message3.contains("Hello");
        System.out.println(isAvailable);

        String emptyWithWhiteSpaces = "      ";
        String empty = "";
        System.out.println("Empty : "+ empty.isEmpty());
        System.out.println("Blank :"+ empty.isBlank());
        System.out.println("Empty : "+ emptyWithWhiteSpaces.isEmpty()); //comes out false because it has space in between
        System.out.println("Blank :"+ emptyWithWhiteSpaces.isBlank());

        System.out.println("Length of Empty :"+ empty.length());
        System.out.println("Length of EmptyWithWhiteSpace :"+ emptyWithWhiteSpaces.length()); //6 because of the spaces

       String replaced = all.replace("-","/");
       System.out.println("Replaced :" + replaced);

       String respond = "060001, A, 5000; 060002, B, 7000";
       String policy1 = respond.substring(0,15);
        String policy2 = respond.substring(16,32);

        System.out.println("Policy 1 : " +policy1);
        System.out.println("Policy 2 :" +policy2);

       String [] policies = respond.split(";");
       String policy1a = policies[0];
       String policy2a = policies [1];

        System.out.println("Policy 1 : " +policy1a);
        System.out.println("Policy 2 :" +policy2a);

        int a = 5;
        String as = String.valueOf(a); //change int, float, long to String

        String test = returnNullFun();
        test = Objects.requireNonNullElse(test, ""); //show the actual String if null then show ""
        System.out.println(test.length());

    }
        public static String returnNullFun(){
       // return null;
            return "060001, A, 5000; 060002, B, 7000";
        }
}
