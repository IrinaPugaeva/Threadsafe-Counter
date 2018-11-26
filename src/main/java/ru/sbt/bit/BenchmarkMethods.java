package ru.sbt.bit;

import org.openjdk.jmh.annotations.*;
import ru.sbt.bit.counter.ConcurrentCounter;
import ru.sbt.bit.counter.SemaphoreCounter;
import ru.sbt.bit.counter.SyncCounter;
import ru.sbt.bit.counter.ReentrantLockCounter;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class BenchmarkMethods {
    private SyncCounter syncCounter;
    private ConcurrentCounter concurrentCounter;
    private SemaphoreCounter semaphoreCounter;
    private ReentrantLockCounter reentrantLockCounter;

    @Setup
    public void setup(){
        syncCounter = new SyncCounter();
        concurrentCounter = new ConcurrentCounter();
        semaphoreCounter = new SemaphoreCounter();
        reentrantLockCounter = new ReentrantLockCounter();
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
    public int semaphoreCounterThreads1() {
        return semaphoreCounter.getCurrentNumber();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(1)
    public int reentrantLockCounterThreads1() {
        return reentrantLockCounter.getCurrentNumber();
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
    public int semaphoreCounterThreads2() {
        return semaphoreCounter.getCurrentNumber();
    }


    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(2)
    public int reentrantLockCounterThreads2() {
        return reentrantLockCounter.getCurrentNumber();
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
    public int semaphoreCounterThreads4() {
        return semaphoreCounter.getCurrentNumber();
    }


    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(4)
    public int reentrantLockCounterThreads4() {
        return reentrantLockCounter.getCurrentNumber();
    }
/*
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
    public int semaphoreCounterThreads8() {
        return semaphoreCounter.getCurrentNumber();
    }


    @Benchmark
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Threads(8)
    public int reentrantLockCounterThreads8() {
        return reentrantLockCounter.getCurrentNumber();
    }*/

}
