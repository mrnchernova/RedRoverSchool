package HW2024.HW5;

/**
 * Дан массив:
 * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
 * необходимо вывести сумму элементов массива.
 */
public class HW_5_1_5 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                x = x + array[i][j];
            }
        }
        System.out.println(x);

    }
}
