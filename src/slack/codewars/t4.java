package slack.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class t4 {
    public static void main(String[] args) {
        String s = "-11 9 3 4 -5";

//        ArrayList<Integer> arraylist = new ArrayList<>();
//        char[] c = s.toCharArray();
//        String str = "";
//
//        for (int i = 0; i < s.length(); i++) {
//            if (c[i] != ' ') {
//                str += c[i];
//            } else {
//                int intstr = Integer.parseInt(str);
//                arraylist.add(intstr);
//                str = "";
//            }
//        }
//        int intstr = Integer.parseInt(str);     // for last el
//        arraylist.add(intstr);                  // for last el
//
//        int max = Collections.max(arraylist);
//        int min = Collections.min(arraylist);
//
//        System.out.println(max + " " + min);


        /** v2 */
        System.out.println(s);
        char[] c = s.toCharArray();
        String str = "";
        int space = 0;


        for (int i = 0; i < s.length(); i++) {
            if (c[i] == ' ') space++;
        }


        int[] intArray = new int[space + 1];
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c[i] != ' ') {
                str += c[i];
            } else {
                intArray[counter++] = Integer.parseInt(str);
                str = "";
            }

        }
        intArray[counter] = Integer.parseInt(str); // for last element
        System.out.println(Arrays.toString(intArray));

        int min = intArray[0];
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
                   if (intArray[i] < min) {
                    min = intArray[i];
                }
                if (intArray[i] > max) {
                    max = intArray[i];
                }

        }
        System.out.println(min);
        System.out.println(max);

    }
}

