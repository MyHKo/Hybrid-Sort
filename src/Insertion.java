import java.util.ArrayList;
public class Insertion {
    public static ArrayList<Integer> sort(ArrayList<Integer> array){
        for(int i = 1; i < array.size(); i++){
            int positionIndex = i;
            int bufferElement = array.get(i);

            while(positionIndex > 0 && bufferElement <= array.get(positionIndex-1)){
                array.set(positionIndex, array.get(positionIndex-1));
                positionIndex--;
            }
            array.set(positionIndex,bufferElement);
        }

        return array;
    }
}
