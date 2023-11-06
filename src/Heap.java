import java.util.ArrayList;
import java.util.Collections;

public class Heap {
    private static void fix(ArrayList<Integer> heap, int index, int size){
        int theGreatest;
        int child1;
        int child2;
        if(index * 2 + 1 <= size - 1 && index * 2 + 2 <= size - 1){
            theGreatest = index;
            child1 = index * 2 + 1;
            child2 = index * 2 + 2;

            if(heap.get(theGreatest) < heap.get(child1)){
                theGreatest = child1;}
            if(heap.get(theGreatest) < heap.get(child2)){
                theGreatest = child2;}

            Collections.swap(heap, index, theGreatest);
        }

        else{
            child1 = index * 2 + 1;
            if(heap.get(index) < heap.get(child1))
                Collections.swap(heap, index, child1);
        }
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> array){
        int heapSize = array.size();
        int lastParent = (heapSize - 2) / 2;

        for(;lastParent >= 0;lastParent --){
            fix(array,lastParent,heapSize);
        }

        return array;
    }

}
