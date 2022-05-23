package Task1;

public abstract class Employee implements IEmployee {

    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        setName(name);
        setBaseSalary(baseSalary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double getSalary();

}
