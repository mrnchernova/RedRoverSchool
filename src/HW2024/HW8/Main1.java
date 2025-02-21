package HW2024.HW8;

/**
 * Задача №1
 * Написать статический метод, превращающий натуральное (целое положительное) число (например, 643) в строку,
 * состоящую из названий цифр этого числа (например, “шесть четыре три”).

 */
public class Main1 {
    public static void main(String[] args) {


        int number = 1232;
        System.out.println(number);
// 1. переворачиваем число 123 -> 321
        int a = 0;
        while (number != 0) {
            a = a * 10 + number % 10;
            number /= 10;
        }
// 2. разбиваем число на цифры
        while (a > 0) {
            int x = a % 10;
            a = a / 10;


            String s = Reverso(x);
            System.out.print(s + " ");
        }

    }

    // 3. метод прописывает чифру буквами
    public static String Reverso(int x) {
        String s = "";
        switch (x) {
            case 1:
                s = "one";
                break;
            case 2:
                s = "two";
                break;
            case 3:
                s = "three";
                break;
            case 4:
                s = "four";
                break;
            case 5:
                s = "five";
                break;
            case 6:
                s = "six";
                break;
            case 7:
                s = "seven";
                break;
            case 8:
                s = "eight";
                break;
            case 9:
                s = "nine";
                break;
            case 0:
                s = "zero";
                break;
            default:
                s = "null";
        }

        return s;
    }

}
