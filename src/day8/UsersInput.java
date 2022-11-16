package day8;

import java.util.Scanner;

public class UsersInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please your name :");

        String fullName = sc.nextLine();

        System.out.println("Please your age :");

        int age = sc.nextInt();

        System.out.println("User Typed :" + age);
        System.out.println("User Typed :" + fullName);

        sc.close();

    }
}
