package Task1;

public final class Director extends Employee{

    private int numberOfSubordinates;
    private final double KOEFF=0.09;

    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates=numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if(numberOfSubordinates==0) {return getBaseSalary();} else{
            return getBaseSalary()*numberOfSubordinates*KOEFF;
        }
    }
}
