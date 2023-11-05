import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertionTest {
    @Test
    void twoDifferentArraysShouldEqual(){
        ArrayList<Integer> arrayToSort = new ArrayList<Integer>(Arrays.asList(7,5,10,2,4,6,1,3,8,9));
        ArrayList<Integer> sortedArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        arrayToSort = Insertion.sort(arrayToSort);
        Assertions.assertEquals(sortedArray, arrayToSort);
    }

    @Test
    void  sortingSortedArray(){
        ArrayList<Integer> arrayToSort = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> sortedArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        arrayToSort = Insertion.sort(arrayToSort);
        Assertions.assertEquals(sortedArray, arrayToSort);
    }

    @Test
    void  sortingWithOnlyOneElementToSort(){
        ArrayList<Integer> arrayToSort = new ArrayList<Integer>(Arrays.asList(10,2,3,4,5,6,7,8,9,1));
        ArrayList<Integer> sortedArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        arrayToSort = Insertion.sort(arrayToSort);
        Assertions.assertEquals(sortedArray, arrayToSort);
    }
}
