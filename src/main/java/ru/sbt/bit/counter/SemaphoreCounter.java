package ru.sbt.bit.counter;

import java.util.concurrent.Semaphore;

public class SemaphoreCounter {
    private int counter = 0;
    private final Semaphore semaphore = new Semaphore(1, true);

    public int getCurrentNumber(){
        int result = 0;
        try {
            semaphore.acquire();
            result = counter++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return result;
    }
}
