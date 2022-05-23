public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иванова", "Мария", "Петровна");
        System.out.println(person.getFullName());

        Person personWithoutName = new Person("Иванова", null, "Петровна");
        System.out.println(personWithoutName.getFullName());

        Person personWithoutPatronymic = new Person("Иванова", "Мария", null);
        System.out.println(personWithoutPatronymic.getFullName());

        Person personWithOnlySurname = new Person("Иванова", null, null);
        System.out.println(personWithOnlySurname.getFullName());
    }
}
