package slack.googleDocTasks;

import java.util.Arrays;

/*
Измени знак элемента массива array на противоположный,
если значение этого элемента чётное.
Пример массива : {-1, 2, 3, -4, -5}
 */
public class t5_ArrayMinus {
    public static void main(String[] args) {
        int[] array = {-1, 2, 3, -4, -5};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] * -1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
