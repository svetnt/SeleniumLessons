public class Student {
    String name;
    String lastName;
    int age;
    String clas;
    String line="________________________";

    void print(){
        System.out.println(line);
        System.out.println(name+" "+lastName);
        System.out.println(age+" лет");
        System.out.println(clas+" класс");
        System.out.println(line);
    }

    public static void main(String [] args){
        Student firstSt=new Student();
        firstSt.name="Вова";
        firstSt.lastName="Сидоров";
        firstSt.age= 10;
        firstSt.clas="5";

        Student secondSt=new Student();
        secondSt.name="Маша";
        secondSt.lastName="Семенова";
        secondSt.age= 14;
        secondSt.clas="9";

        firstSt.print();
        secondSt.print();

    }
}
