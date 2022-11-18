package day9;

public class ConditionalStatement {

    public static void main(String[] args) {

        int sale = 5;
        int target = 10;
        boolean canReceiveBonus = sale >= target;

        String performance;
        int bonus;
        String prefix;

        if (canReceiveBonus){
             performance = "Satisfactory";
             bonus = 100;
             prefix = "Great";

            //System.out.println(String.format("Great your performance is %s and you receive bonus %s",performance,bonus));
        }
        else {
             performance = "Unsatisfactory";
             bonus = 0;
             prefix = "Sorry";

            //System.out.println(String.format("Sorry your performance is %s you receive bonus %s", performance, bonus));
        }

        System.out.println(String.format("%s your performance is %s and you receive bonus %s",prefix, performance ,bonus));
        // Put in the scope, and not like this unless you need to.
        performance = null;

        if (sale >= 2* target) {
            performance = "Excellent";
            bonus = 1000;
            prefix = "Great";
        }
        else if (sale >= 1.5* target) {
            performance = "Fine";
            bonus = 500;
            prefix = "Great";
        }
        else if (sale >= target) {
            performance = "Satisfactory";
            bonus = 100;
            prefix = "Great";
        }
        else {
            performance = "Unsatisfactory";
            bonus = 0;
            prefix = "Fired";
        }

        System.out.println("Execution completed");
    }
}
