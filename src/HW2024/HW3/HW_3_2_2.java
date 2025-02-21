package HW2024.HW3;

/**
 * Необходимо вывести все положительные степени числа 5 которые меньше 10000,
 * вывести результат возведения в степень.
 */
public class HW_3_2_2 {
    public static void main(String[] args) {
        System.out.println("first variant");
        int a = 5;
        int n = 1;

        while (n <= 10000) {
            System.out.println(n);
            n = n * a;
        }

        System.out.println("\nsecond variant");
        int b = 5;
        int m = 0;
        while((int) Math.pow(b,m) <= 10000){
            System.out.println((int) Math.pow(b,m));
            m++;
        }
    }
}
