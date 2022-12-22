package day17;

import java.util.ArrayList;

public class ExceptionHandling {

    public static void main(String[] args) {

        ArrayList<String> testList = new ArrayList<>();

        try {
            String data = testList.get(5);
            System.out.println(data);
        } catch (IndexOutOfBoundsException e) { // or just write Exception e if you don't know the error
            e.printStackTrace();
            System.out.println(e.getMessage());
            return;
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("The code outside");

        printPdf();
    }

    public static void printPdf() throws RuntimeException {
        throw new RuntimeException("Can not print");
    }
}
