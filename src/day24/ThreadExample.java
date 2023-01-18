package day24;

import java.util.logging.Logger;

public class ThreadExample {

    public static void main(String[] args) {

        Runnable r = () -> {

            if (Thread.currentThread().isInterrupted()){
                return;
            }

            //System.out.println(Thread.currentThread().getName());
            Logger.getGlobal().info(Thread.currentThread().getName());

            if (Thread.currentThread().isDaemon()){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            Logger.getGlobal().info(String.valueOf(Thread.currentThread().getName() + " : " + Thread.currentThread().isInterrupted()));

        };

        Thread t1 = new Thread(r); //Thread 0 without setting name
        t1.setName("Thread 1");

        Thread t2 = new Thread(r); //Thread 1
        t2.setName("Thread 2");
        t2.setDaemon(true);

        Thread t3 = new Thread(r); //Thread 2
        t3.setName("Thread 3");
        t3.setPriority(Thread.MAX_PRIORITY);

        Thread t4 = new Thread(r); //Thread 3
        t4.setName("Thread 4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        //  t4.stop();
        t4.interrupt();

        AnalyticsThread analyticsThread = new AnalyticsThread();

        analyticsThread.start();
    }
}
