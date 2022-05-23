package Task1;

public final class Manager extends Employee implements IManager {

    private int numberOfSubordinates;

    public Manager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if(numberOfSubordinates==0) { return getBaseSalary(); } else {
            return getBaseSalary()*numberOfSubordinates*KOEFF;
        }
    }


}
