/* Класс для хранения и обработки информации о человеке */
public class Person {
    /* Имя, фамилия, отчество */
    private String name;
    private String surname;
    private String patronymic;

    /* Конструктор */
    public Person (String surname, String name, String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    /* Возвращает имя в формате Фамилия И.О. */
    public String getFullName(){
        String fullName;
        if (!(name == null)){
            if (!(patronymic == null)){
                fullName = surname + " " + name.charAt(0) + "." + patronymic.charAt(0) + ".";
            }
            else{
                fullName = surname + " " + name.charAt(0) + ".";
            }
        }
        else if (!(patronymic == null)){
            fullName = surname + " " + patronymic.charAt(0) + ".";
        }
        else{
            fullName = surname;
        }
        return fullName;
    }
}
