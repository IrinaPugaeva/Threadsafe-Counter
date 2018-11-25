package ru.sbt.bit;

import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;

public class BenchmarkRunner {
    public static void main(String[] args) throws IOException, RunnerException {
        Options options = new OptionsBuilder()
                .include(BenchmarkMethods.class.getSimpleName())
                .resultFormat(ResultFormatType.CSV)
                .result("benchmark_result.csv")
                .mode(Mode.Throughput)
                .forks(1)
                .warmupIterations(15)
                .measurementIterations(25)
                .build();
        new Runner(options).run();
    }
}
