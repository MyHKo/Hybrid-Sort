import java.util.ArrayList;

public class CheckSorts {
    public static long checkInsertion(ArrayList<Integer> array){
        long timeBefore = System.nanoTime();
        Insertion.sort(array);
        long timeAfter = System.nanoTime();
        return timeAfter - timeBefore;
    }

    public static long checkHeap(ArrayList<Integer> array){
        long timeBefore = System.nanoTime();
        Heap.sort(array);
        long timeAfter = System.nanoTime();
        return timeAfter - timeBefore;
    }

    public static long checkQuick(ArrayList<Integer> array){
        long timeBefore = System.nanoTime();
        Quick.sort(array,0, array.size());
        long timeAfter = System.nanoTime();
        return timeAfter - timeBefore;
    }

    public static long checkRadix(ArrayList<Integer> array){
        long timeBefore = System.nanoTime();
        Radix.sort(array);
        long timeAfter = System.nanoTime();
        return timeAfter - timeBefore;
    }
}
