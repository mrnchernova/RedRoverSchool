package HW2024.HW5;

/**
 * Дана строка:
 * String s = “Посмотрите как Рите нравится ритм”;
 * необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
 * Для указанной строки ответ будет 6, 15, 29.
 */
public class HW_5_2_3 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();
        String substr = "рит";


        for (int i = 0; i < s.length()-substr.length(); i++) {
            if (s.substring(i, i + substr.length()).equals(substr)){
                System.out.println(i);
            }

        }
    }
}
