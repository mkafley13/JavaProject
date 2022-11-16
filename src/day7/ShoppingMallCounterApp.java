package day7;

public class ShoppingMallCounterApp {

    public static void main(String[] args) {

        Counter door1 = new Counter();
        Counter door2 = new Counter();
        Counter door3 = new Counter();
        Counter door4 = new Counter();

        door1.increaseCount();
        door1.increaseCount();

        door2.decreaseCount();

        System.out.println("Door1 : " + door1.getCount());
        System.out.println("Door2 : " + door2.getCount());
        System.out.println("Door3 : " + door3.getCount());
        System.out.println("Door4 : " + door4.getCount());
    }
}
