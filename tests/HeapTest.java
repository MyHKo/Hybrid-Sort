import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class HeapTest {

    @Test
    void twoDifferentArraysShouldEqual(){
        ArrayList<Integer> arrrayToSort = new ArrayList<Integer>(Arrays.asList(7,5,10,2,4,6,1,3,8,9));
        ArrayList<Integer> sortedArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        arrrayToSort = Heap.sort(arrrayToSort);
        Assertions.assertEquals(sortedArray, arrrayToSort);
    }

    @Test
    void  sortingSortedArray(){
        ArrayList<Integer> arrrayToSort = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> sortedArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        arrrayToSort = Heap.sort(arrrayToSort);
        Assertions.assertEquals(sortedArray, arrrayToSort);
    }

    @Test
    void  sortingWithOnlyOneElementToSort(){
        ArrayList<Integer> arrrayToSort = new ArrayList<Integer>(Arrays.asList(10,2,3,4,5,6,7,8,9,1));
        ArrayList<Integer> sortedArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        arrrayToSort = Heap.sort(arrrayToSort);
        Assertions.assertEquals(sortedArray, arrrayToSort);
    }
}
