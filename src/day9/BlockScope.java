package day9;

public class BlockScope {
    static int global = 0;
    public static void main(String[] args) {
        System.out.println(global);

        int local = 7;
        {
            int block = 5;
            local = block;
            System.out.println(global);
            System.out.println(local);
        }

       // System.out.println(block);
        System.out.println(local);

    }
}
