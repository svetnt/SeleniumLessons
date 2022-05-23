package homework;

public class HW2 {

    public static void main(String [] args){

        Cifr first=new Cifr();
        first.setA(3);
        first.setB(5);
        first.setC(7);
        first.setX(2);
        first.setY(3);

        System.out.println("______________________________");
        System.out.println("task"+"\t"+"rezult");
        System.out.println("______________________________");
        System.out.println("21"+"\t"+"    "+first.rezult21());
        System.out.println("______________________________");
        System.out.println("22"+"\t"+"    "+first.rezult22());
        System.out.println("______________________________");
        System.out.println("23"+"\t"+"    "+first.rezult23());
    }

    static class Cifr{

        public int a;
        public int b;
        public int c;
        public int x;
        public int y;

        public int getA(){
            return a;
        }
        public void setA(int a){
            this.a=a;
        }

        public int getB(){
            return b;
        }
        public void setB(int b){
            this.b=b;
        }
        public int getC(){
            return c;
        }
        public void setC(int c){
            this.c=c;
        }
        public int getX(){
            return x;
        }
        public void setX(int x){
            this.x=x;
        }
        public int getY(){
            return y;
        }
        public void setY(int y){
            this.y=y;
        }

        int rezult21(){
            return (x+3)*(x+3);
        }

        int rezult22(){
            return (3+4*x)/5-10*(y-5)*(a+b+c)/x+9*(4/x+(9+x)/y);
        }

         double rezult23(){
            double chis1=1.0*(5*x+7*y)/(8*x+10*y);
            double chis2=1.0*(3*x-y)/(x+y);
            double chis=chis1/chis2;
            double znam=0.0+a+b+c/(x*y)+(a+b)/(c+x*y)+a*b;
            return chis/znam;
         }
    }

}
