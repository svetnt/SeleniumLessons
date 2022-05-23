import java.util.Arrays;
import  java.util.Random;

public class Main {
    final static int n = 100;
    final static int k = 50;
    static int[] arr;

    /* определение простоты числа */
    public static boolean isSimple(int ANum) {
        if (ANum < 2)
            return false;
        if (ANum == 2)
            return true;
        double s = Math.sqrt(ANum);
        for (int i = 2; i <= s; i++) {
            if (ANum % i == 0)
                return false;
        }
        return true;
    }

    /* пузырьковая сортировка */
    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}

    public static void main(String[] args) {
        arr = new int[n];

        /* заполнение массива рандомными числами */
        final Random random = new Random();
        for (int i = 0; i < n; i++){
            arr[i] = random.nextInt(k);
        }

        /* считаем количество простых чисел и чисел кратных трем */
        int simple = 0;
        int three = 0;
        for (int i = 0; i < n; i++){
            if (isSimple(arr[i])){
                simple++;
            };
            if (arr[i] % 3 == 0){
                three++;
            }
        }

        /* сортируем */
        bubbleSort(arr);

        /* выводим результат */
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
        System.out.println("Количество простых: " + simple);
        System.out.println("Количество кратных трем: " + three);
    }
}
