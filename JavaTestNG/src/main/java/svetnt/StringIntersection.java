package svetnt;

import java.util.HashSet;

public class StringIntersection {
    /*алгоритм StringIntersection,  который принимает на вход 2 строки и возвращает общее вхождение
     в этих строках Test Data: “Carrot”, “carwash” → “car”   “Noob”, “Schmooze” → “oo” */

    public String stringIntersection(String text_1, String text_2) throws IndexOutOfBoundsException, NullPointerException {
        String result = "", value;
        if (text_1.length() > text_2.length()) {
            value = text_1;
            text_1 = text_2;
            text_2 = value;
        }

        HashSet<String> set1 = new HashSet<String>();
        HashSet<String> set2 = new HashSet<String>();

        set1.add(text_1.toLowerCase());

        boolean flag = true;
        while (flag) {

            for (String el : set1) {
                if (el.length() == 1) {
                    flag = false;
                    break;
                }
                set2.add(el.substring(0, el.length() - 1));
                set2.add(el.substring(1));
            }

            for (String el : set2) {
                if (el.length() == 1) {
                    flag = false;
                    break;
                }
                set1.add(el.substring(0, el.length() - 1));
                set1.add(el.substring(1));
            }
        }

        for (String el : set1) {
            if (text_2.toLowerCase().contains(el) && el.length() > result.length()) {
                result = el;
            }
        }
        for (String el : set2) {
            if (text_2.toLowerCase().contains(el) && el.length() > result.length()) {
                result = el;
            }
        }
        if (result.length() == 0) {
            return "Общих символов нет";
        } else {
            return result;
        }
    }
}

