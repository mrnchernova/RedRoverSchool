
/**
 * Дан массив:
 * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
 * необходимо вывести сумму всех значений массива.
 */
public class HW_5_1_1 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            n = n + array[i];
        }
        System.out.println(n);

    }
}
