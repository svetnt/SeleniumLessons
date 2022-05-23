package homework;

public class HW6 {
    public static void main(String[] args) {

    System.out.println("Задание №1");
        for(int i=0; i<=9; i++){
        System.out.print(i+" ");}
           System.out.print("\n"+"\n");

        System.out.println("Задание №2");
        for(int i=10-1; i>=0; i--){
        System.out.print(i+" ");}
           System.out.print("\n"+"\n");

        System.out.println("Задание №3");
        for(int i=50; i<=55; i+=2){
        System.out.print(i+" ");}
           System.out.print("\n"+"\n");

        System.out.println("Задание №4");
        for(int i=327; i>=300; i--){
        if(i%7==0){System.out.print(i+" ");} }
           System.out.print("\n"+"\n");

        System.out.println("Задание №5");
        for(double i=12; i<=13; i+=0.1){
        System.out.printf("%.1f ",i);}
           System.out.print("\n"+"\n");

        System.out.println("Задание №6");
        for(int i=215; i<=237; i++){
        if(i%2==0){ System.out.printf(i+" ");}}
           System.out.print("\n"+"\n");

        System.out.println("Задание №7");
        for(int i=7+1; i<14; i++){
        if(i%7==0){ System.out.printf(i+" ");}}
           System.out.print("\n"+"\n");
System.out.println("Задание №8");
        for(double i=Short.MIN_VALUE; i<=Short.MAX_VALUE; i++){
        if(i%15001==0){ System.out.printf("%.0f ",i);}}
            System.out.print("\n"+"\n");

         System.out.println("Задание №9");
        for(int i=-10; i<=34; i++){
        if(i%11==0) { System.out.print("\u001B[34m"+i+" "+"\u001B[0m"); } else {
            if(i%12==0) { System.out.print("\u001B[31m"+i+" "+"\u001B[0m"); } else {
                if(i==0) { System.out.print("ZERO"+" "); } else {
                    System.out.print(i+" "); } }}}
          System.out.print("\n"+"\n");

    metodZad10(3, 7, 0.5);

    metodZad11(6);

    metodZad12(6);

             System.out.println("Задание №13");
            for(int k=0; k<4; k++){
        for(int j=0; j<=9; j++){
            for(int i=0; i<=k; i++){
                System.out.print(j+" "); } } }
            System.out.print("\n"+"\n");

     System.out.println("Задание №14");
        System.out.print(0+", ");
            for(int i=1, j=-1; i<=5 && j>=-5; i++, j--){
        System.out.print(i+", "+j+", ");    }
            System.out.print("\n"+"\n");


            System.out.println("Задание №15");
           for(int i=0; i<=25; i++){
        if(i%3==0 || i%5==0) {System.out.print(i+", ");    }  }
            System.out.print("\n"+"\n");

    metodZad16(2, 3, 8);

            System.out.println("Задание №17");
          System.out.print("n, ");
        for(int i=2; i<=10; i+=2){
        System.out.print("n+"+i+", ");    }
            System.out.print("\n"+"\n");

    metodZad18(3, 8);

            System.out.println("Задание №19");
          for(int i=10; i<100; i++){
        if(Math.abs(i/10-i%10)<=3){
            System.out.print(i+" ");    } }
            System.out.print("\n"+"\n");

        System.out.println(metodZad20(0));
}

    public static void metodZad10(double start, double end, double step){
        System.out.println("Задание №10");
        for(double i=start; i<=end; i+=step){
            System.out.printf("%.2f  ",i);  }
        System.out.print("\n"+"\n");}

    public static void metodZad11(int l){
        System.out.println("Задание №11");
        for(int i=0; i<l*2; i++){
            if(i%2==0) { System.out.print(i+" ");  } }
        System.out.print("\n"+"\n");}

    public static void metodZad12(int n){
        System.out.println("Задание №12");
        for(int i=1; i<=n; i++){
            System.out.print((int)Math.pow(2,i)+" ");   }
        System.out.print("\n"+"\n");}

    public static void metodZad16(int n, int m, int l){
        System.out.println("Задание №16");
        int count=0;
        if(n%2==0 && m%2==0){ System.out.println("Нечетных чисел нет");} else{
            for(int i=n; true; i+=m){
                if(i%2!=0) { System.out.print(i+" "); count++;  }
                if(count==l){break;}}
            System.out.print("\n"+"\n");} }

    public static void metodZad18(int l, int n){
        System.out.println("Задание №18");
        int count=0;
        for(int i=n; true; i=2*i){
            System.out.print(i+" ");
            count++;
            if(count==l){break;}  }
        System.out.print("\n"+"\n");}

    public static double metodZad20(double x){
        System.out.println("Задание №20");
        if(x>1.5) { return 2.5-x*x*x+6*x*x-30; } else {
            if (x>=0 && x<=1.5) {return x+1;} else {
                return x;} }
    }


}
