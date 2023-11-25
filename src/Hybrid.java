import java.util.ArrayList;
import java.util.Collections;

public class Hybrid{
    public static ArrayList<Integer> sort(ArrayList<Integer> array, int firstElement, int lastElement){

        if(lastElement - firstElement < 55){
            for(int i = firstElement; i < lastElement; i++){
                int positionIndex = i;
                int bufferElement = array.get(i);

                while(positionIndex > firstElement && bufferElement <= array.get(positionIndex-1)){
                    array.set(positionIndex, array.get(positionIndex-1));
                    positionIndex--;
                }
                array.set(positionIndex,bufferElement);
            }
        }

        else {
            if (firstElement < lastElement) {
                int left = firstElement + 1;
                int right = lastElement - 1;
                while (true) {
                    while (left < right && array.get(left) < array.get(firstElement))
                        left++;
                    while (array.get(right) > array.get(firstElement))
                        right--;
                    if (left < right) {
                        Collections.swap(array, left, right);
                        left++;
                        right--;
                    } else break;
                }

                Collections.swap(array, right, firstElement);

                Hybrid.sort(array, firstElement, right);
                Hybrid.sort(array, right + 1, lastElement);
            }
        }
        return array;
    }
}
