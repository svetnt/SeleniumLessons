import java.util.Objects;

/* Класс для хранения и обработки информации об адресе */
public class Address{
    private String city;
    private String street;
    private int house;

    public Address(String city, String street, int house){
        this.city = city;
        this.street = street;
        this.house = house;
    }

    /* Получить улицу */
    public String getStreet(){
        return this.street;
    }

    /* переопределение метода equals() */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return house == address.house && this.city.equals(address.city) && this.street.equals(address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, house);
    }

    /* переопределение метода toString() */
    @Override
    public String toString(){
        return "Город " + city + ", улица " + street + ", дом " + house;
    }
}