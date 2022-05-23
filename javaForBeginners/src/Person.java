public class Person {
    public static void main(String[] args) {

        double price = 25.13;
        System.out.println(str(price));

        String expectedResult = "25 руб 13 коп";
        verifyEquals(expectedResult, price);
    }

    public static String str(double price) {
        double rub = Math.floor(price);
        double kop = Math.round((price - rub) * 100);
        return String.format("%2.0f руб %2.0f коп", rub, kop);
    }

 /*   public static String str(double price){
        String sPrice=Double.toString(price);
        String rub=sPrice.substring(0,sPrice.indexOf('.'));
        String kop=sPrice.substring(sPrice.indexOf('.')+1);
        return rub + " руб " + kop+" коп";
    }*/

    public static void verifyEquals(String expectedResult, double price) {
        String actualResult = str(price);
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "PASS" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "FAIL" + "\u001B[0m");
        }
    }
}
