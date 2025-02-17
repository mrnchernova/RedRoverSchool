package slack.googleDocTasks;
/*
Используя цикл for вывести на экран прямоугольный треугольник из единиц со сторонами (катетами) 5 и 5.
То есть в первой строке должна быть одна 1, начиная слева, во второй - две и т.д.
Пример вывода на экран:
1
11
111
1111
11111
 */
public class t2_Triangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(1);
            }
            System.out.println();

        }
    }
}
