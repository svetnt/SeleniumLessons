package Task1;

import static Task1.Utils.getEmplName;
import static Task1.Utils.getMaxNumberSubordinates;

public class Main {
    public static void main(String[] args) {

        Worker and=new Worker("And", 19000);
        Worker tat=new Worker("Tat", 17000);
        Manager max=new Manager("Max", 25000, 10);
        Manager alex=new Manager("Alex", 35000, 20);
        Manager micl=new Manager("Micl", 20000, 15);
        Director log=new Director("Log", 50000, 100);

        Employee [] arr={and,tat,max,log};
        Manager [] arrMan={alex, max, micl};

        System.out.println(getEmplName(arr,"Tap").getSalary());
        System.out.println(getMaxNumberSubordinates(arrMan).getName());


    }
}
