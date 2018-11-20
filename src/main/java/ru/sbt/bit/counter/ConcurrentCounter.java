package ru.sbt.bit.counter;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.util.concurrent.atomic.AtomicInteger;

@State(Scope.Benchmark)
public class ConcurrentCounter {
    private final AtomicInteger counter = new AtomicInteger(0);

    public int getCurrentNumber() {
        return counter.getAndDecrement();
    }

}