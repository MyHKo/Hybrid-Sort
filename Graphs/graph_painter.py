import matplotlib.pyplot as plt
import pandas as pd

data = pd.read_csv("data.txt", delimiter=" ")
data = data.set_index("Size")

data[["InsertionSort", "QuickSort", "HeapSort", "RadixSort"]].plot(linewidth=4)

plt.savefig("allSorts.png")

data[["QuickSort", "HeapSort", "RadixSort"]].plot(linewidth=4)

plt.savefig("withoutInsertion.png")

data[["QuickSort", "RadixSort"]].plot(linewidth=4)

plt.savefig("quickAndRadix.png")
