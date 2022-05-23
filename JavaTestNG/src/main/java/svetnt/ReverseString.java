package svetnt;

public class ReverseString {
    /*алгоритм ReverseString, который переворачивает строку */


    public String reverseString(String text) throws NullPointerException {

        char[] arr = text.toCharArray();
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result = result.concat(Character.toString(arr[i]));
        }
        return result;
    }
}
