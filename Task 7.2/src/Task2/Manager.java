package Task2;

import Task2.BaseEmployee;
import Task2.IMonth;

public final class Manager extends BaseEmployee {
    private int namberP;

    public Manager(String name, int age, String gender, int salary, int namberP) {
        setName(name);
        setAge(age);
        setGender(gender);
        setSalary(salary);
        this.namberP = namberP;
    }

    public int getNamberP() {
        return namberP;
    }

    public void setNamberP(int namberP) {
        this.namberP = namberP;
    }

    @Override
    public double[] getSalaryM(IMonth[] monthArray) {
        double[] salaryArray = new double[monthArray.length];
        for (int i = 0; i < monthArray.length; i++) {
            salaryArray[i] = monthArray[i].getRabDay() * getSalary()+monthArray[i].getRabDay()*getSalary()*0.01*this.namberP;
        }
        return salaryArray;
    }
}
