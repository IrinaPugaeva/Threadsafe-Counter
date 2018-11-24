package ru.sbt.bit.counter;


import java.util.concurrent.atomic.AtomicInteger;


public class ConcurrentCounter {
    private final AtomicInteger counter = new AtomicInteger(0);

    public int getCurrentNumber() {
        return counter.getAndIncrement();
    }

}