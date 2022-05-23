package svetnt;

import java.util.Arrays;

public class StringToNumbers {

    /*И_10.15 Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
    Test Data: “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5} (Без форматирования) */

    public int[] stringToNumbers(String s) throws NumberFormatException, NullPointerException{

        String [] arrString=s.split(",");
        int [] result=new int[arrString.length];
        for (int i=0; i<arrString.length; i++){
            result[i]=Integer.parseInt(arrString[i].trim());
        }
        return result;
    }
}
