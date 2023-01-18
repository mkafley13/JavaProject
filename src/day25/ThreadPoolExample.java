package day25;

import java.lang.reflect.Executable;
import java.util.concurrent.*;

public class ThreadPoolExample {

    public static void main(String[] args) {

        Runnable task1 = () -> {
            System.out.println("Task1");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };

        Runnable task2 = () -> {
            System.out.println("Task2");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };

        Runnable task3 = () -> {
            System.out.println("Task3");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };

        Runnable task4 = () -> {
            System.out.println("Task4");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);
        executor.submit(task4);

        //executor.shutdown();

        Callable<Integer> task5 = () -> {
            System.out.println("Task5 started");
            int temp = 5 + 10;
            return temp;
        };

       Future<Integer> result5 = executor.submit(task5);

        try {
            int sum = result5.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        executor.shutdown();

        System.out.println("Normal code");

    }
}
