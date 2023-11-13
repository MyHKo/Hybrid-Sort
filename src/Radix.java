import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Radix {
    public static ArrayList<Integer> sort(ArrayList<Integer> array){
        int lastDigits = 10;
        int currentDigit = 1;

        for(int theLargest = Collections.max(array); theLargest != 0; theLargest /= 10) {

            ArrayList<Integer> position = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
            ArrayList<Integer> output = (ArrayList) array.clone();
            int digit;

            for (int i : array) {
                digit = (i % lastDigits) / currentDigit;
                position.set(digit, position.get(digit) + 1);
            }

            for(int i = 1; i < 10; i++){
                position.set(i, position.get(i) + position.get(i - 1));
            }

            for (int i = array.size() - 1; i >= 0; i--){
                digit = (array.get(i) % lastDigits) / currentDigit;
                output.set(position.get(digit) - 1, array.get(i));
                position.set(digit, position.get(digit) - 1);
            }

            for (int i = 0; i < array.size(); i++){
                array.set(i, output.get(i));
            }

            lastDigits *= 10;
            currentDigit *= 10;

        }

        return array;
    }
}
