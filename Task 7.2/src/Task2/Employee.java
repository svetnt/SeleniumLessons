package Task2;

import Task2.BaseEmployee;

public final class Employee extends BaseEmployee {

    private String name;
    private int age;
    private String gender;
    private int salary;

    public Employee(String name, int age, String gender, int salary) {
        this.name = name;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public double[] getSalaryM(IMonth[] monthArray) {
        double[] salaryArray = new double[monthArray.length];
        for (int i = 0; i < monthArray.length; i++) {
            salaryArray[i] = monthArray[i].getRabDay() * this.salary;
        }
        return salaryArray;
    }
}
