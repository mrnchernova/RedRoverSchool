package HW2025.HW6;

import java.util.Arrays;

/**
 * Создайте массив размером 5 на 5 (или 10 на 10, или любого другого размера так, чтобы количество строк и количество столбцов совпадало).
 * Преобразуйте этот массив таким образом, чтобы то, что было строками, стало столбцами и наоборот.
 * Внимание! Не надо менять структуру массива. Задание требует только переместить элементы массива.
 * Тип элементов массива может быть любой по вашему выбору.
 * <p>
 * Пример:
 * Если взять массив целых чисел размером 3 на 3:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * <p>
 * то после преобразования он должен выглядеть вот так:
 * 1 4 7
 * 2 5 8
 * 3 6 9
 */

public class t5_extra_extra {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int x = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = x;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



    }
}
