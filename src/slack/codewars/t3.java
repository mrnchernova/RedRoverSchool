package slack.codewars;


/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them.
It should look like this:
Sam Harris => S.H
patrick feeney => P.F
*/
public class t3 {
    public static void main(String[] args) {

        System.out.println(abbrevName("Sam harris"));
    }

    public static String abbrevName(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (name.indexOf(" ") != -1) {
                return name.toUpperCase().charAt(0) + "." + name.toUpperCase().charAt(name.indexOf(" ") + 1);
            }
        }
        return name;
    }
}
