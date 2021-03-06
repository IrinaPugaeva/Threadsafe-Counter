import pandas as pd
import matplotlib 
matplotlib.use('agg')
import matplotlib.pyplot as plt
plt.switch_backend('agg')
def plot_benchmark_results():
    df = pd.read_csv('benchmark_result.csv')
    df['Benchmark'] = df['Benchmark'].apply(lambda x: x.split('.')[4][:x.split('.')[4].find('Counter')])
    df['Score'] = df['Score'].apply(lambda x : float(x) * 1000.0 / 1000.0)
    df = df.sort_values(by=['Threads'])
    plt.ylabel(df['Unit'].unique()[0])
    plt.xlabel('ThreadCount')
    plt.title('Зависимость между количеством потоков и операций в микросекунду')
    for name in df['Benchmark'].unique():
        plt.plot(df[df.Benchmark == name]['Threads'], df[df.Benchmark == name]['Score'], label=name)
    plt.legend()
    plt.savefig('img/benchmark.png')
    plt.close()
    
plot_benchmark_results()