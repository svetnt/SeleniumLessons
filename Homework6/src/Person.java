import java.util.Objects;

/* Класс для хранения и обработки информации о человеке */
public class Person {
    /* Имя, фамилия, отчество, день, месяц и год рождения */
    private String name;
    private String surname;
    private String patronymic;
    private int day;
    private int month;
    private int year;
    private Address address;

    /* Конструктор */
    public Person (String surname, String name, String patronymic, int day, int month, int year, String city, String street, int house){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.day = day;
        this.month = month;
        this.year = year;
        this.address = new Address(city, street, house);
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

    // возвращает строку с датой рождения
    public String getDate(){
        String daystr;
        String monthstr;
        if (day < 10){
            daystr = "0" + Integer.toString(day);
        }
        else{
            daystr = Integer.toString(day);
        }
        if (month < 10){
            monthstr = "0" + Integer.toString(month);
        }
        else{
            monthstr = Integer.toString(month);
        }
        return daystr + "." + monthstr + "." + Integer.toString(year);
    }

    // переопределение метода toString()
    @Override
    public String toString(){
        return getFullName() + " Дата рождения: " + getDate() + ", " + address;
    }

    private String getStreet(){
        return address.getStreet();
    }

    /* сравнение даты рождения с другой датой */
    private boolean dateBefore(int d, int m, int y){
        if (year < y){
            return true;
        }
        if (year > y){
            return false;
        }
        if (month < m){
            return true;
        }
        if (month > m){
            return false;
        }
        if (day < d){
            return true;
        }
        if (day > d){
            return false;
        }
        return false;
    }

    private boolean dateAfter(int d, int m, int y){
        return (!dateBefore(d, m, y)) && (!(d == day && m == month && y == year));
    }

    private boolean isYounger(Person p){
        if (this.year > p.year){
            return true;
        }
        if (this.year < p.year){
            return false;
        }
        if (this.month > p.month){
            return true;
        }
        if (this.month < p.month){
            return false;
        }
        if (this.day > p.day){
            return true;
        }
        return false;
    }

    /* Вывести список людей с фамилией s */
    public static void findSurname(Person[] arr, String s){
        System.out.println("Люди с фамилией " + s + ":");
        for (int i = 0; i < arr.length; i++){
            if (arr[i].surname.equals(s)){
                System.out.println(arr[i]);
            }
        }
    }

    /* Вывести список людей из города c, улицы s, дома h */
    public static void findAddress(Person[] arr, String c, String s, int h){
        Address addr = new Address(c, s, h);
        System.out.println("Люди с адресом " + addr + ":");
        for (int i = 0; i < arr.length; i++){
            if (arr[i].address.equals(addr)){
                System.out.println(arr[i]);
            }
        }
    }

    /* Найти пару людей с однаковыми улицами */
    public static void findSameStreet(Person[] arr){
        System.out.println("Люди, проживающие на одной улице:");
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i].getStreet().equals(arr[j].getStreet()) && i != j){
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                    return;
                }
            }
        }
    }

    /* Вывести список людей, рожденных между d1 m1 y1 и d1 m2 y2 */
    public static void findDates(Person[] arr, int d1, int m1, int y1, int d2, int m2, int y2){
        System.out.println("Люди, рожденные после " + d1 + "." + m1 + "." + y1 + " но до "+ d2 + "." + m2 + "." + y2 + " ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i].dateBefore(d2, m2, y2) && arr[i].dateAfter(d1, m1, y1)){
                System.out.println(arr[i]);
            }
        }
    }

    /* Вывести самого молодого человека */
    public static void theYoungest(Person[] arr){
        System.out.println("Самый молодой человек :");
        Person y = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i].isYounger(y)){
                y = arr[i];
            }
        }
        System.out.println(y);
    }
}
