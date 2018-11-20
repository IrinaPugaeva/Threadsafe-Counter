package ru.sbt.bit.counter;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class SyncCounter {
    private int counter = 0;

    public synchronized int getCurrentNumber() {
        return counter++;
    }
}
