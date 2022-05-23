/* Решатель квадратных уравнений вида ax^2+bx+c=0 */
public class Solver {
    /* параметры a, b, c */
    private float a;
    private float b;
    private float c;

    /* дискриминант */
    private float d;

    /* enum для обозначения результата: нет корней, один корень, два корня */
    private enum result
    {
        noRoots,
        oneRoot,
        twoRoot,
        anyRoot
    }

    /* количество корней */
    private result res;

    /* корни уравнения */
    public double x1;
    public double x2;

    public Solver(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /* вложенный класс для вычисления дискриминанта */
    private static class Discriminant{
        /* вычисление дискриминанта по формуле D = b^2-4ac */
        static float solveDiscriminant(float a,float b,float c){
            float discr = b*b-4*a*c;
            return discr;
        }
    }

    /* вычисление количства корней */
    private void calculatingRootsNumber(){
        if (d < 0){
            res = result.noRoots;
        }
        else if (d == 0){
            res = result.oneRoot;
        }
        else{
            res = result.twoRoot;
        }
    }

    /* решение уравнения */
    public void solve(){
        if (a == 0){    // обработка случаев с нулевым a (не квадратное уравнение)
            if (b == 0){
                if (c == 0){
                    res = result.anyRoot;
                    return;
                }
                res = result.noRoots;
                return;
            }
            res = result.oneRoot;
            x1 = -c/b;
            return;
        }
        d = Discriminant.solveDiscriminant(a, b, c);
        calculatingRootsNumber();
        if(res == result.twoRoot){
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);
        }
        else if(res == result.oneRoot){
            x1 = -b/(2*a);
        }
    }

    /* печать результата */
    public void printResult(){
        if (res == result.noRoots){
            System.out.println("Уравнение " + a + "x^2 + " + b + "x + " + c + " = 0 не имеет корней");
        }
        else if (res == result.oneRoot){
            System.out.println("Уравнение " + a + "x^2 + " + b + "x + " + c + " = 0 имеет корень " + x1);
        }
        else if (res == result.twoRoot){
            System.out.println("Уравнение " + a + "x^2 + " + b + "x + " + c + " = 0 имеет корни " + x1 + " и " + x2);
        }
        else if (res == result.anyRoot){
            System.out.println("Любое вещественное число является корнем уравнения " + a + "x^2 + " + b + "x + " + c + " = 0");
        }
        else{
            System.out.println("Произошла ошибка при вычислении");
        }
    }
}
