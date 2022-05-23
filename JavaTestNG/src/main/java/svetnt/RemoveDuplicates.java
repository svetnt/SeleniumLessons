package svetnt;

public class RemoveDuplicates {
    /*алгоритм RemoveDuplicates, который принимает строку и возвращает строку уникальных букв:
“AABBCCaabbcc” → “abc”*/


    public String removeDuplicates(String text) throws NullPointerException, IndexOutOfBoundsException{
        text = text.toLowerCase();
        char[] arr = text.toCharArray();
        String result = Character.toString(text.charAt(0));
        for (int j = 1; j < arr.length; j++) {
            if (result.indexOf(arr[j]) == -1) {
                result = result.concat(Character.toString(arr[j]));
            }
        }
        return result;
    }

}
