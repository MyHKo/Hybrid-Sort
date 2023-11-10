import java.util.ArrayList;
import java.util.Collections;

public class Heap {
    private static int fix(ArrayList<Integer> heap, int index, int size){
        int theGreatest = 0;
        int theGreatestElement = heap.get(index);
        int child1;
        int child2;
        if(index * 2 + 2 <= size - 1){
            child1 = index * 2 + 1;
            child2 = index * 2 + 2;

            if(theGreatestElement < heap.get(child1)){
                theGreatest = child1;
                theGreatestElement = heap.get(child1);}

            if(theGreatestElement < heap.get(child2)){
                theGreatest = child2;
                theGreatestElement = heap.get(child2);}

            if(theGreatest != 0)
                Collections.swap(heap, index, theGreatest);
        }

        else if(index * 2 + 1 <= size - 1){
            child1 = index * 2 + 1;
            if(heap.get(index) < heap.get(child1)){
                Collections.swap(heap, index, child1);
                return child1;}
        }

        return theGreatest;
    }

    public static void makeHeap(ArrayList<Integer> array){
        int parent;
        for (int i = 0; i < array.size(); i++){
            for (int j = i; j > 0; j = parent){
                parent = (j-1)/2;
                    if (array.get(j) > array.get(parent))
                        Collections.swap(array, j, parent);
            }
        }
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> array){
        makeHeap(array);
        int elementToFix;
        boolean heapFixed;

        for(int i = array.size(); i > 1;){
            Collections.swap(array,0, i - 1);
            i--;
            elementToFix = 0;
            do {
                elementToFix = fix(array,elementToFix,i);
            }
            while (elementToFix != 0);

        }

        return array;
    }

}
