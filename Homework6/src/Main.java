public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Иванова", "Мария", "Петровна", 12, 5, 2001,
                "Москва", "Ленина", 10);
        persons[1] = new Person("Соколов", "Андрей", "Петров", 12, 10, 2001,
                "Самара", "Виноградная", 1);
        persons[2] = new Person("Иванов", "Михаил", "Александрович", 10, 11, 2000,
                "Москва", "Ленина", 11);
        persons[3] = new Person("Петрова", "Мария", "Петровна", 14, 11, 1998,
                "Казань", "Центральная", 9);
        persons[4] = new Person("Соколова", "Дарья", "Петровна", 12, 5, 1999,
                "Рязань", "Цветочная", 34);

        Person.findSurname(persons, "Соколова");
        System.out.println();
        Person.findAddress(persons,"Самара", "Виноградная", 1);
        System.out.println();
        Person.findDates(persons, 15, 11, 1998, 12, 6, 2001);
        System.out.println();
        Person.theYoungest(persons);
        System.out.println();
        Person.findSameStreet(persons);
    }
}
