import java.util.Collections;
import java.util.ArrayList;

public class Quick {
    public static int sort(ArrayList<Integer> array, int pivot, int size){
        if(pivot < size) {
            int left = pivot + 1;
            int right = size - 1;
            while (true) {
                while (left < right && array.get(left) < array.get(pivot))
                    left++;
                while (array.get(right) > array.get(pivot))
                    right--;
                if (left < right) {
                    Collections.swap(array, left, right);
                    left++;
                    right--;
                } else break;
            }

            Collections.swap(array, right, pivot);

            Quick.sort(array, pivot, right);
            Quick.sort(array, right + 1, size );

            return right;
        }
        return 0;
    }
}
