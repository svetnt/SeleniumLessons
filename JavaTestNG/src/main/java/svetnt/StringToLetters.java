package svetnt;

public class StringToLetters {
    /*алгоритм принимает строку,  и удаляет всё кроме букв*/

    public String stringToLetters(String s) throws NullPointerException {

        char[] arrChar = s.toCharArray();
        String result = "";
        for (char elem : arrChar) {
            if (Character.isAlphabetic(elem)) {
                result += elem;
            }
        }
        if (result.length() == 0) {
            return "В строке нет букв";
        } else {
            return result;
        }
    }

}
