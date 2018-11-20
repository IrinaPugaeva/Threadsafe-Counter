package ru.sbt.bit;

import org.openjdk.jmh.annotations.*;
import ru.sbt.bit.counter.ConcurrentCounter;
import ru.sbt.bit.counter.SyncCounter;

public class BenchmarkMethods {
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Fork(value = 1, warmups = 1)
    @Threads(2)
    public int synchronizedCounter(SyncCounter counter) {
        return counter.getCurrentNumber();
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Fork(value = 1, warmups = 1)
    @Threads(2)
    public int atomicCounter(ConcurrentCounter counter) {
        return counter.getCurrentNumber();
    }
}
