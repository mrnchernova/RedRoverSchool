package HW2025.HW6;


/**
 * Дана строка:
 * String s = “Перевыборы выбранного президента”;
 * необходимо подсчитать количество букв “е” в строке.
 * Для указанной строки ответ будет 4.
 */
public class t2 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                count++;
            }

        }
        System.out.println(count);
    }
}
