/**
 * Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
 * Реализовать 2 варианта:
 * использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
 * без использования конструкции if (шаг цикла на ваше усмотрение).
 */
public class HW_3_2_3 {
    public static void main(String[] args) {
        int a = 40;
        int b = 60;

        for (int i = a; i <= b; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();
        while (a <= b) {
            while (a % 4 == 0) {
                System.out.println(a);
                a++;
            }
            a++;
        }

    }
}
