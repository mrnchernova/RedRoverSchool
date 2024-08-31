/**
 * Дан массив из десяти произвольных целых чисел (например, { 1, 2, …, 9, 10 } )
 * Необходимо изменить порядок элементов массива на противоположный
 * (т.е. чтобы получилось { 10, 9, …, 2, 1 } ).
 * Не НАПЕЧАТАТЬ в обратном порядке, а переставить элементы массива.
 */
public class HW_4_star {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
