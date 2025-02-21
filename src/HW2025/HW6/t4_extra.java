package HW2025.HW6;

/**
 * Дан массив:
 * String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
 * необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
 */
public class t4_extra {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто" },
                {"изучает", "язык", "программирования" },
                {"java" }};
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) {
                    x++;
                }

            }

        }
        System.out.println(x);
    }
}
