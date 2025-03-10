package slack.codewars;

import java.util.Arrays;

public class TempCodewars {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(digitize("I   love arrays they are my favorite")));

    }


    public static String[] digitize(String s) {
        s = s.trim();
        s = s.replaceAll("\s+", " ");
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') count++;
        }

        String[] array = new String[count + 1];
        int j = 0;
        String news = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                news += s.charAt(i);
            } else {
                array[j++] = news;
                news = "";
            }
        }
        array[j] = news;
        return array;
    }
}

