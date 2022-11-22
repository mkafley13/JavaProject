package day8;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name");

        String name = scanner.nextLine();

        System.out.println("Enter your grade for Math class");

        float math = scanner.nextFloat();

        System.out.println("Enter your grade for Science class");

        float science = scanner.nextFloat();

        System.out.println("Enter your grade for English class");

        float english = scanner.nextFloat();

        System.out.println("Enter your grade for Computer class");

        float computer = scanner.nextFloat();

        System.out.println("Enter your grade for Social Study class");

        float socialStudy = scanner.nextFloat();

        float total = (math + science + english + computer + socialStudy) / (500) * 100;

        String message = String.format("The Mark Obtained by %s is %.2f",name, total);

        System.out.println(message);

        if (total >= 90) {
            //System.out.println("You received grade of A");
            System.out.println(String.format("%s you received total grade of A", name));
        }
        else if (total >=80 && total <=90){
            //System.out.println("You received grade of B");
            System.out.println(String.format("%s you received total grade of B", name));
        }
        else if (total >=70 && total <=80){
            //System.out.println("You received grade of C");
            System.out.println(String.format("%s you received total grade of C", name));
        }
        else if (total >=60 && total <=70){
            //System.out.println("You received grade of D");
            System.out.println(String.format("%s you received total grade of D", name));
        }
        else {
            //System.out.println("You received grade of F");
            System.out.println(String.format("%s you received total grade of F", name));
        }

    }
}
