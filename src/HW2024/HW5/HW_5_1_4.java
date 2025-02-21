package HW2024.HW5;

/**
 * Дан массив:
 * int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
 * необходимо вывести среднее арифметическое всех значений массива.
 */
public class HW_5_1_4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double x = 0;
        for (int i = 0; i < array.length; i++) {
            x = x + array[i];
        }
        System.out.println(x/array.length);

    }
}
