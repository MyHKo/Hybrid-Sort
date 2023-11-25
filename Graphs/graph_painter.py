import matplotlib.pyplot as plt
import pandas as pd

data = pd.read_csv("data.txt", delimiter=" ")
data = data.set_index("Size")

data[["InsertionSort", "QuickSort", "HeapSort", "RadixSort", "HybridSort"]].plot(linewidth=2)

plt.savefig("allSorts.png")

data[["QuickSort", "InsertionSort", "HybridSort"]].plot(linewidth=2)

plt.savefig("quickInsertionHybrid.png")
