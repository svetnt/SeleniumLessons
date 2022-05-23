package homework;

public class HW5 {
    public static void main(String[] args) {

        int n=1998;
        System.out.println(happy(n));

        int expectedResult=9;
        if(expectedResult==happy(n)){
            System.out.println("\u001B[32m"+"PASS"+"\u001B[0m");
        } else {
            System.out.println("\u001B[31m"+"FAIL"+"\u001B[0m");
        }
    }

    public static int happy(int n){
        int sum=0;
        while(true){
            while(n !=0){
                sum += n%10;
                n /= 10;
            }
            if(sum<=9){
                break; } else {
                n=sum;
                sum=0;}
        }
        return sum;
    }
}
