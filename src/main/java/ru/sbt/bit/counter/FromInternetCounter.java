package ru.sbt.bit.counter;

import java.util.concurrent.locks.ReentrantLock;

public class FromInternetCounter {
    private int counter = 0;

    private ReentrantLock counterLock = new ReentrantLock(true);

    public int getCurrentNumber(){
        counterLock.lock();
        try {
            counter++;
        }
        finally {
            counterLock.unlock();
        }
        return counter;
    }
}
