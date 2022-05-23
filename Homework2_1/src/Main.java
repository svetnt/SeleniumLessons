import java.util.Scanner;

public class Main {

    /* Перевод числа из шестнадцатеричной в десятичную */
    public static int hex2decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }

    /* Перевод числа из десятичной в шестнадцатеричную */
    public static String decimal2hex(int d) {
        String digits = "0123456789ABCDEF";
        if (d <= 0) return "0";
        String hex = "";
        while (d > 0) {
            int digit = d % 16;
            hex = digits.charAt(digit) + hex;
            d = d / 16;
        }
        return hex;
    }

    public static void main(String[] args) {
        /* Чтение чисел */
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();

        /* Перевод в десятичную */
        int first_int = hex2decimal(first);
        int second_int = hex2decimal(second);

        /* Арифметичнские операции */
        int addition = first_int + second_int;
        int subtraction = first_int - second_int;
        int multiplication = first_int * second_int;
        int division = first_int / second_int;
        int increment = first_int + 1;
        int decrement = first_int - 1;

        /* Вывод результата */
        System.out.println(first + " + " + second + " = " + decimal2hex(addition));
        System.out.println(first + " - " + second + " = " + decimal2hex(subtraction));
        System.out.println(first + " * " + second + " = " + decimal2hex(multiplication));
        System.out.println(first + " / " + second + " = " + decimal2hex(division));
        System.out.println(first + "++ = " + decimal2hex(increment));
        System.out.println(first + "-- = " + decimal2hex(decrement));
    }
}
