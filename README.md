# Threadsafe-Counter
Homework#3

# Run complete. Total time: 00:23:43

| Benchmark                           |         Mode | Cnt    |     Score   |      Error | Units |
|-------------------------------------|:------------:|--------|-------------|------------|-------|
|BenchmarkMethods.atomicCounterThreads16|        thrpt|   20|  37171036,096 ±  284794,613  ops/s|
|BenchmarkMethods.atomicCounterThreads2|         thrpt|   20|  61395268,568 ± 4417292,124  ops/s|
|BenchmarkMethods.atomicCounterThreads4|         thrpt|   20|  36669369,668 ±  379687,020  ops/s|
|BenchmarkMethods.atomicCounterThreads8|         thrpt|   20|  39651301,955 ±  290542,788  ops/s|
|BenchmarkMethods.synchronizedCounterThreads16|  thrpt|   20|  18451784,600 ±  106221,525  ops/s|
|BenchmarkMethods.synchronizedCounterThreads2|   thrpt|   20|  15132415,069 ±  673780,367  ops/s|
|BenchmarkMethods.synchronizedCounterThreads4|   thrpt|   20|  16238785,300 ±  251517,716  ops/s|
|BenchmarkMethods.synchronizedCounterThreads8|   thrpt|   20|  16407292,921 ±   90502,719  ops/s|
|BenchmarkMethods.atomicCounterThreads16|         avgt|   20|        ≈ 10⁻⁶|                 s/op|
|BenchmarkMethods.atomicCounterThreads2|          avgt|   20|        ≈ 10⁻⁷|                 s/op|
|BenchmarkMethods.atomicCounterThreads4|          avgt|   20|        ≈ 10⁻⁷                 s/op|
|BenchmarkMethods.atomicCounterThreads8|          avgt|   20|        ≈ 10⁻⁷                 s/op|
|BenchmarkMethods.synchronizedCounterThreads16|   avgt|   20|        ≈ 10⁻⁶                 s/op|
|BenchmarkMethods.synchronizedCounterThreads2|    avgt|   20|        ≈ 10⁻⁷                 s/op|
|BenchmarkMethods.synchronizedCounterThreads4|    avgt|   20|        ≈ 10⁻⁷                 s/op|
|BenchmarkMethods.synchronizedCounterThreads8|    avgt|   20|        ≈ 10⁻⁶                 s/op|
