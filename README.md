# Threadsafe-Counter
Homework#3

# Run complete. Total time: 00:23:43

| Benchmark | Threads                          |         Mode | Cnt    |     Score   |      Error | Units |
|-----------|--------------------------|:------------:|--------|-------------|------------|-------|
|atomicCounter|2|         thrpt|   20|  61395268,568 ± 4417292,124  ops/s|
|atomicCounter|4|         thrpt|   20|  36669369,668 ±  379687,020  ops/s|
|atomicCounter|8|         thrpt|   20|  39651301,955 ±  290542,788  ops/s|
|atomicCounter|16|        thrpt|   20|  37171036,096 ±  284794,613  ops/s|
|synchronizedCounter|2|   thrpt|   20|  15132415,069 ±  673780,367  ops/s|
|synchronizedCounter|4|   thrpt|   20|  16238785,300 ±  251517,716  ops/s|
|synchronizedCounter|8|   thrpt|   20|  16407292,921 ±   90502,719  ops/s|
|synchronizedCounter|16|  thrpt|   20|  18451784,600 ±  106221,525  ops/s|
|atomicCounter|2|          avgt|   20|        ≈ 10⁻⁷                 s/op|
|atomicCounter|4|          avgt|   20|        ≈ 10⁻⁷                 s/op|
|atomicCounter|8|          avgt|   20|        ≈ 10⁻⁷                 s/op|
|atomicCounter|16|         avgt|   20|        ≈ 10⁻⁶                 s/op|
|synchronizedCounter|2|    avgt|   20|        ≈ 10⁻⁷                 s/op|
|synchronizedCounter|4|    avgt|   20|        ≈ 10⁻⁷                 s/op|
|synchronizedCounter|8|    avgt|   20|        ≈ 10⁻⁶                 s/op|
|synchronizedCounter|16|   avgt|   20|        ≈ 10⁻⁶                 s/op|
