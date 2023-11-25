import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;

public class Main {

    public static void main(String[] args){
        try {
            Random randomiser = new Random();
            int rand_int;
            int sizeMultiplier = 1;

            File dataFile = new File("Graphs\\data.txt");
            FileWriter writer = new FileWriter(dataFile);

            long timeBefore;
            long timeAfter;
            long insertionTime = 0;
            long quickTime = 0;
            long heapTime = 0;
            long radixTime = 0;
            long hybridTime = 0;

            writer.write("Size InsertionSort QuickSort HeapSort RadixSort HybridSort\n");

            for (int size = 1; size < 101; size += sizeMultiplier, System.out.println(size)) {

                insertionTime = 0;
                quickTime = 0;
                heapTime = 0;
                radixTime = 0;
                hybridTime = 0;

                for (int j = 0; j < 100000; j++) {

                    ArrayList<Integer> insertionArray = new ArrayList<Integer>();
                    ArrayList<Integer> heapArray = new ArrayList<Integer>();
                    ArrayList<Integer> quickArray = new ArrayList<Integer>();
                    ArrayList<Integer> radixArray = new ArrayList<Integer>();
                    ArrayList<Integer> hybridArray = new ArrayList<Integer>();

                    for(int random_number = 0; random_number < size; random_number++){
                        rand_int = randomiser.nextInt(size);
                        insertionArray.add(rand_int);
                        heapArray.add(rand_int);
                        quickArray.add(rand_int);
                        radixArray.add(rand_int);
                        hybridArray.add(rand_int);
                    }

                    timeBefore = System.nanoTime();
                    Insertion.sort(insertionArray);
                    timeAfter = System.nanoTime();
                    insertionTime += (timeAfter - timeBefore);

                    timeBefore = System.nanoTime();
                    Quick.sort(quickArray, 0, size);
                    timeAfter = System.nanoTime();
                    quickTime += (timeAfter - timeBefore);

                    timeBefore = System.nanoTime();
                    Heap.sort(heapArray);
                    timeAfter = System.nanoTime();
                    heapTime += (timeAfter - timeBefore);

                    timeBefore = System.nanoTime();
                    Radix.sort(radixArray);
                    timeAfter = System.nanoTime();
                    radixTime += (timeAfter - timeBefore);

                    timeBefore = System.nanoTime();
                    Hybrid.sort(hybridArray, 0, size);
                    timeAfter = System.nanoTime();
                    hybridTime += (timeAfter - timeBefore);

                }

                writer.write(size + " " + (insertionTime / 100000) + " " + (quickTime / 100000) + " " + (heapTime / 100000)
                        + " " + (radixTime / 100000) + " " + (hybridTime / 100000) + "\n");

            }
            writer.close();
        }
        catch (Exception e){
            System.out.println("Something went wrong");
            e.printStackTrace();}
    }
}
