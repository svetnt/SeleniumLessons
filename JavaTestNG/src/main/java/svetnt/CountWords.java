package svetnt;

public class CountWords {
    /*  алгоритм CountWords, который принимает на вход текст и слово,  и считает все вариации
     этого слова в тексте     */

    public int countWords(String text, String word){
        int result=0;
        int index=text.indexOf(word+" ");
        if(index==-1){
            System.out.println("Такого слова нет"); return 0;} else {
        result++;
        while (index!=-1){
            index=text.indexOf(word+" ", index+word.length());
            result++;
        }
        return result;}
    }

}
