import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;

public class Main {

    public static void main(String[] args){
        try {
            Random randomiser = new Random();
            int rand_int;
            int sizeMultiplier = 10;

            File dataFile = new File("Graphs\\data.txt");
            FileWriter writer = new FileWriter(dataFile);

            long timeBefore;
            long timeAfter;
            long insertionTime = 0;
            long quickTime = 0;
            long heapTime = 0;
            long radixTime = 0;

            writer.write("Size InsertionSort QuickSort HeapSort RadixSort\n");

            for (int size = 10; size < 100001; size += sizeMultiplier, System.out.println(size)) {

                insertionTime = 0;
                quickTime = 0;
                heapTime = 0;
                radixTime = 0;

                for (int j = 0; j < 100; j++) {

                    ArrayList<Integer> insertionArray = new ArrayList<Integer>();
                    ArrayList<Integer> heapArray = new ArrayList<Integer>();
                    ArrayList<Integer> quickArray = new ArrayList<Integer>();
                    ArrayList<Integer> radixArray = new ArrayList<Integer>();

                    for(int random_number = 0; random_number < size; random_number++){
                        rand_int = randomiser.nextInt(size);
                        insertionArray.add(rand_int);
                        heapArray.add(rand_int);
                        quickArray.add(rand_int);
                        radixArray.add(rand_int);
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

                }

                writer.write(size + " " + (insertionTime / 100) + " " + (quickTime / 100) + " " + (heapTime / 100)
                        + " " + (radixTime / 100) + "\n");

                if(size == 100)
                    sizeMultiplier *= 10;
                else if(size == 1000)
                    sizeMultiplier *= 10;
                else if(size == 10000)
                    sizeMultiplier *= 10;


            }
            writer.close();
        }
        catch (Exception e){
            System.out.println("Something went wrong");
            e.printStackTrace();}
    }
}
