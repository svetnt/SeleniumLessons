package Task2;

import Task2.Employee;
import Task2.Manager;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee ivan = new Employee("Иван", 29, "м", 1000);
        Employee mari = new Employee("Мария", 23, "ж", 5000);
        Manager aleks=new Manager("Александр",31, "м", 7500,6 );


        System.out.println(Arrays.toString(mari.getSalaryM(IMonth.getQuarter(3))));
        System.out.println(Arrays.toString(aleks.getSalaryM(IMonth.getHalf(1))));


    }
}
