package slack.googleDocTasks;

/*
        Дана строка из цифр. Вам нужно заменить все цифры меньше 5 на «0»,
        а все цифры от 5 и выше — на «1».
        Примечание: входные данные никогда не будут пустой строкой
        */
public class t9_String {
    public static void main(String[] args) {
        String s = "305719";
        char[] charArray = s.toCharArray();

        String newS = "";

        for (int i = 0; i < s.length(); i++) {
            int n = Integer.parseInt(String.valueOf(charArray[i]));

            if (n < 5) {
                newS += "0";
            } else {
                newS += Integer.toString(n + 1);
            }

        }
        System.out.println(s);
        System.out.println(newS);
    }

}
