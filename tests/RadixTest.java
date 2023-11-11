import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RadixTest {
    @Test
    void twoDifferentArraysShouldEqual(){
        ArrayList<Integer> arrayToSort = new ArrayList<Integer>(Arrays.asList(7,5,10,2,4,6,1,3,8,9));
        ArrayList<Integer> sortedArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));


        Radix.sort(arrayToSort, 0, arrayToSort.size());
        Assertions.assertEquals(sortedArray, arrayToSort);
    }

    @Test
    void  sortingSortedArray(){
        ArrayList<Integer> arrayToSort = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> sortedArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Radix.sort(arrayToSort, 0, arrayToSort.size());
        Assertions.assertEquals(sortedArray, arrayToSort);
    }

    @Test
    void  sortingWithOnlyOneElementToSort(){
        ArrayList<Integer> arrayToSort = new ArrayList<Integer>(Arrays.asList(10,2,3,4,5,6,7,8,9,1));
        ArrayList<Integer> sortedArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Radix.sort(arrayToSort, 0, arrayToSort.size());
        Assertions.assertEquals(sortedArray, arrayToSort);
    }

    @Test
    void multipleRandomTests(){
        for (int i = 0; i < 10000; i++) {
            Random rand = new Random();
            ArrayList<Integer> arrayToSort = new ArrayList<Integer>();
            ArrayList<Integer> sortedArray = new ArrayList<Integer>();
            for (int j = 0; j < 1000; j++) {
                int id = rand.nextInt();
                arrayToSort.add(i);
                sortedArray.add(i);
            }
            Collections.sort(sortedArray);

            Radix.sort(arrayToSort, 0, arrayToSort.size());
            Assertions.assertEquals(sortedArray, arrayToSort);
        }
    }
}
