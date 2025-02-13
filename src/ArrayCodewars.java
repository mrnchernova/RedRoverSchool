
import java.util.Arrays;

/**!!!
 * [1, -1, 2, -2, 3] => 3
 * [-3, 1, 2, 3, -1, -4, -2] => -4
 * [1, -1, 2, -2, 3, 3] => 3
 */
public class ArrayCodewars {
    public static void main(String[] args) {
//        int[] array = {1, -1, 2, -2, 3};
//        int[] array = {-3, 1, 2, 3, -1, -4, -2};
        int[] array = {1, -1, 2, -2, 3, 3};

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            boolean match = false;
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == 0) {
                    match = true;
                }
            }
            if (!match) {
                int[] newArray = new int[count];
                count++;
//                int[] newArray = {array[i]};
            }
        }

        int[] newArray = new int[count];
        int n = 0;

        for (int i = 0; i < array.length; i++) {
            boolean match = false;
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == 0) {
                    match = true;
                }
            }
            if (!match) {
                newArray[n] = array[i];
                n++;
            }
        }
        System.out.println("new array " + Arrays.toString(newArray));


    }
}
