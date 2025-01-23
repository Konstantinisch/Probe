package de.telran.synchronize;


import java.util.concurrent.atomic.AtomicInteger;

public class MainSynchronized {
    private static final AtomicInteger counter = new AtomicInteger(1);
    private static final int MAX_COUNT = 100;
    public static void main(String[] args) {
        Runnable task = () -> {
            while (true) {
                synchronized (counter) {
                    int currentValue = counter.getAndIncrement();
                    if (currentValue > MAX_COUNT) {
                        break;
                    }
                    System.out.println("Thread " + Thread.currentThread().getName() + ": " + currentValue);
                }
            }
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

