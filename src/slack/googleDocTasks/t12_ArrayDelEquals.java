package slack.googleDocTasks;

import java.util.Arrays;

/*
Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками ""null"").
        Массив:
        {""Hello"", ""Hello"", ""World"", ""Java"", ""Tasks"", ""World""}
        Массив после удаления повторяющихся строк:
        {null, null, null, ""Java"", ""Tasks"", null}
 */
public class t12_ArrayDelEquals {
    public static void main(String[] args) {
        String[] s = {"Hello", "Hello", "World", "Java", "Tasks", "World", "Hello"};
        System.out.println(Arrays.toString(s));

        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                String word = s[i];
                boolean copy = false;
                for (int j = i + 1; j < s.length; j++) {
                    if (s[i].equals(s[j])) copy = true;
                }
                if (copy) {
                    for (int k = i; k < s.length; k++) {
                        if (s[k] != null) {
                            if (s[k].equals(word)) s[k] = null;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(s));
    }
}
