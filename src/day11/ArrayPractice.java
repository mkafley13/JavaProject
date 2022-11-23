package day11;

import day1.bank.BankAccount;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] a = {2, 5, 7, 9}; // this is your array value

        int[] ar = new int[10]; // when you don't know how many value there will be. Max will be 10 array value

        int data1 = a[1]; //shows it's 5
        System.out.println(data1);

        a[0] = 4; // updates the data in position 0 and turns 2 into 4
        System.out.println(a[0]);

        System.out.println(Arrays.toString(a)); // Shows the value in the array

        BankAccount[] accounts = new BankAccount[3];

        accounts[0] = new BankAccount("2246", "ACD",600);
        accounts[1] = new BankAccount("4366", "AAC",800);

        System.out.println(Arrays.toString(accounts));

        System.out.println("a length : " + a.length);
        System.out.println("ar length : " + ar.length);
        System.out.println("accounts length : " + accounts.length);

        System.out.println("Last index : " + (accounts.length - 1));


    }
}
