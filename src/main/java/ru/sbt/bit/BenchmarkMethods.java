package ru.sbt.bit;

import org.openjdk.jmh.annotations.*;
import ru.sbt.bit.counter.ConcurrentCounter;
import ru.sbt.bit.counter.FromInternetCounter;
import ru.sbt.bit.counter.SyncCounter;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class BenchmarkMethods {
    private SyncCounter syncCounter;
    private ConcurrentCounter concurrentCounter;
    private FromInternetCounter fromInternetCounter;

    @Setup
    public void setup(){
        syncCounter = new SyncCounter();
        concurrentCounter = new ConcurrentCounter();
        fromInternetCounter = new FromInternetCounter();
    }
    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(1)
    public int synchronizedCounterThreads1() {
        return syncCounter.getCurrentNumber();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(1)
    public int atomicCounterThreads1() {
        return concurrentCounter.getCurrentNumber();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(1)
    public int fromInternetCounterThreads1() {
        return fromInternetCounter.getCurrentNumber();
    }


    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(2)
    public int synchronizedCounterThreads2() {
        return syncCounter.getCurrentNumber();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(2)
    public int atomicCounterThreads2() {
        return concurrentCounter.getCurrentNumber();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(2)
    public int fromInternetCounterThreads2() {
        return fromInternetCounter.getCurrentNumber();
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
    @Threads(4)
    public int fromInternetCounterThreads4() {
        return fromInternetCounter.getCurrentNumber();
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

    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(8)
    public int fromInternetCounterThreads8() {
        return fromInternetCounter.getCurrentNumber();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(16)
    public int synchronizedCounterThreads16() {
        return syncCounter.getCurrentNumber();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(16)
    public int atomicCounterThreads16() {
        return concurrentCounter.getCurrentNumber();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(16)
    public int fromInternetCounterThreads16() {
        return fromInternetCounter.getCurrentNumber();
    }

}
