package day24;

import java.util.logging.Logger;

public class ThreadExample {

    public static void main(String[] args) {

        Runnable r = () -> {
            //System.out.println(Thread.currentThread().getName());
            Logger.getGlobal().info(Thread.currentThread().getName());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        Thread t4 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        AnalyticsThread analyticsThread = new AnalyticsThread();

        analyticsThread.start();
    }
}
