package ru.sbt.bit.counter;


public class SyncCounter {
    private int counter = 0;

    public synchronized int getCurrentNumber() {
        return counter++;
    }
}
