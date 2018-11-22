package ru.sbt.bit;

import org.openjdk.jmh.annotations.*;
import ru.sbt.bit.counter.ConcurrentCounter;
import ru.sbt.bit.counter.SyncCounter;

public class BenchmarkMethods {
    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @Fork(value = 1, warmups = 1)
    @Threads(2)
    public int synchronizedCounterThreads2(SyncCounter counter) {
        return counter.getCurrentNumber();
    }

    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @Fork(value = 1, warmups = 1)
    @Threads(4)
    public int synchronizedCounterThreads4(SyncCounter counter) {
        return counter.getCurrentNumber();
    }

    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @Fork(value = 1, warmups = 1)
    @Threads(8)
    public int synchronizedCounterThreads8(SyncCounter counter) {
        return counter.getCurrentNumber();
    }

    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @Fork(value = 1, warmups = 1)
    @Threads(16)
    public int synchronizedCounterThreads16(SyncCounter counter) {
        return counter.getCurrentNumber();
    }

    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @Fork(value = 1, warmups = 1)
    @Threads(2)
    public int atomicCounterThreads2(ConcurrentCounter counter) {
        return counter.getCurrentNumber();
    }

    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @Fork(value = 1, warmups = 1)
    @Threads(4)
    public int atomicCounterThreads4(ConcurrentCounter counter) {
        return counter.getCurrentNumber();
    }

    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @Fork(value = 1, warmups = 1)
    @Threads(8)
    public int atomicCounterThreads8(ConcurrentCounter counter) {
        return counter.getCurrentNumber();
    }

    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @Fork(value = 1, warmups = 1)
    @Threads(16)
    public int atomicCounterThreads16(ConcurrentCounter counter) {
        return counter.getCurrentNumber();
    }
}
