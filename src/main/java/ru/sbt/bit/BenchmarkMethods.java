package ru.sbt.bit;

import org.openjdk.jmh.annotations.*;
import ru.sbt.bit.counter.ConcurrentCounter;
import ru.sbt.bit.counter.SyncCounter;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class BenchmarkMethods {
    private SyncCounter syncCounter;
    private ConcurrentCounter concurrentCounter;

    @Setup
    public void setup(){
        syncCounter = new SyncCounter();
        concurrentCounter = new ConcurrentCounter();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(4)
    public int synchronizedCounterThreads4() {
        return syncCounter.getCurrentNumber();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(4)
    public int atomicCounterThreads4() {
        return concurrentCounter.getCurrentNumber();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(8)
    public int synchronizedCounterThreads8() {
        return syncCounter.getCurrentNumber();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(8)
    public int atomicCounterThreads8() {
        return concurrentCounter.getCurrentNumber();
    }

}
