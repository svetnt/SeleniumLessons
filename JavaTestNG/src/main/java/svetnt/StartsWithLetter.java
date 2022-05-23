package svetnt;

import java.util.ArrayList;
import java.util.Locale;

public class StartsWithLetter {
    /* алгоритм StartsWithLetter, который принимает на вход текст,
    и возвращает в виде строки все слова, которые начинаются с определённой буквы */

    public String startsWithLetter(String text, char bukva) throws NullPointerException, IndexOutOfBoundsException {

        text = text.replace('.', ' ').replace(',', ' ').replace(';', ' ').replace('\n', ' ');

        while (text.contains("  ")) {
            text = text.replace("  ", " ");
        }

        String[] arr = text.split(" ");
        ArrayList<String> list = new ArrayList<String>();

        for (String el : arr) {
            if (el.toLowerCase().charAt(0) == bukva) {
                list.add(el);
            }
        }

        if (list.size() == 0) {
            return "Слов, начинающихся с такой буквы, нет";
        } else {
            String result = "";
            for (String el : list) {
                result = result.concat(el).concat(",");
            }
            return result;
        }
    }

}