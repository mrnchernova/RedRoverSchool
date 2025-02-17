package slack.googleDocTasks;
/*
Легкая задача.
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа
Пример:
[4, 6]
4 = 2
5 = -
6 = 2 3
 */
public class t3_Divider {
    public static void main(String[] args) {
        int m = 4;
        int n = 8;
        for (int i = m; i <= n; i++) {
            boolean del = true;
            System.out.print("num " + i + " = ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    del = false;
                }
                if (del) {
                    System.out.print("-");
                    break;
                }
            }
            System.out.println(" ");
        }
    }
}
