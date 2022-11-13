package day5;

public class RelationalOperator {

    public static void main(String[] args) {

        boolean output1 = 7 == 7; //is equal to

        System.out.println(output1);

        boolean output2 = 7 != 7; // is not equal to

        System.out.println(output2);

        int age = 15;

        Boolean isAgeValid = age >= 18; //is the age greater than or equal to 18

        System.out.println(isAgeValid);

        // age 18-65 --> age >= 18 AND/OR age <= 65
        // 100 >= 18 OR 100 <=65, since the 100 is greater than 18
        // and if we use OR (||) only one condition has to be ture for the whole to be true, so we will use AND(&&)

        Boolean isAgeValid1 = (age >= 18) && (age <= 65);

       String message = (age > 18) ? "Access Granted" : "Access Denied";
       //if condition is true then first will be looked, else second one.
        System.out.println(message);



    }
}
