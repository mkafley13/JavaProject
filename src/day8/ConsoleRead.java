package day8;

import java.io.Console;
import java.util.Arrays;

public class ConsoleRead {     // Put in new folder and only open via local CMD / Terminal.

    public static void main(String[] args) {
        Console cons = System.console();
        String username = cons.readLine("User name : ");
        char[] passwd = cons.readPassword("Password : ");

        System.out.println(Arrays.toString(passwd));
    }
}
