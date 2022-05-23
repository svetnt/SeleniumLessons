package svetnt;

public class LongestCommonSubstring extends StringIntersection {
    /* алгоритм LongestCommonSubstring, который принимает 3 строки и ищет самое длинное общее пересечение:
       “Smaze”, “amazing”, “amazon” → “maz” */

    public String longestCommonSubstring(String str1, String str2, String str3) throws IndexOutOfBoundsException,
            NullPointerException{

        String result = super.stringIntersection(str1, str2);

        return super.stringIntersection(result, str3);

    }

}
