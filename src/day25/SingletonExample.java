package day25;

public class SingletonExample {

    public static void main(String[] args) {

        // Database db1 = new Database();
        // Database db2 = new Database();
        // Database db3 = new Database();

        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();

        System.out.println(db1);
        System.out.println(db2);

        System.out.println(db1 == db2); //If memory location is the same
    }
}
