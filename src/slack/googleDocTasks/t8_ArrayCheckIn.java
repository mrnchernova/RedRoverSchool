package slack.googleDocTasks;

import java.util.Arrays;

/*
        Вам будет предоставлен массив arr и значение x. Всё, что вам нужно сделать, — это проверить,
        содержит ли предоставленный массив это значение.
        arr может содержать числа или строки. x может быть любым.
        Возвращает, true если массив содержит значение, false если нет.
*/
public class t8_ArrayCheckIn {
    public static void main(String[] args) {

//        Object[] array = {"qaz", "qwe", "asd"};
        Object[] array = {11, 22, 33};
        Object x = 22;

        if (x.getClass().getSimpleName() == array[0].getClass().getSimpleName()) {
            for (int i = 0; i < array.length; i++) {
                if (x == array[i]) {
                    System.out.println("match! \n" + x + " in " + Arrays.toString(array));
                    break;
                }
            }
        } else {
            System.out.println("the values are not equal");
        }
    }
}
