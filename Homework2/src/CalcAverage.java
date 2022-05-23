import java.util.Scanner;	//импорт класса

public class CalcAverage {
    public static void main(String args[]) {
        /* считывание чисел */
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();

        /* вычисление среднего арифметического */
        float average = (float)(i1+i2+i3)/3;

        /* вычисление среднего максимального */
        int max = 0;
        if (i1 > i2){
            if (i1 > i3){
                max = i1;
            }
            else{
                max = i3;
            }
        }
        else if (i2 > i3){
            max = i2;
        }
        else{
            max = i3;
        }

        /* печать результатов */
        System.out.println("Среднее арифметическое: " + average);
        System.out.println("Максимальное число: " + max);
    }
}