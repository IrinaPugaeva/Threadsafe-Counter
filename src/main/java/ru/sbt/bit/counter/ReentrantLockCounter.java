package ru.sbt.bit.counter;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockCounter{

    private int counter;
    private final ReentrantLock reentrantLock = new ReentrantLock(true);

    public int getCurrentNumber(){
        reentrantLock.lock();
        try {
            return counter++;
        } finally {
            reentrantLock.unlock();
        }
    }
}
