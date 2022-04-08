import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = 0;
    protected String adress;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
    }

    public boolean hasAge() {
        return age == 0;
    }

    public boolean hasAdress() {
        return adress != null;
    }

    public void happyBirthday() {
        age++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdress(String currentCity) {
        this.adress = currentCity;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", currentCity='" + adress + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder pb = new PersonBuilder();
        pb.setSurname(this.surname);
        pb.setAdress(this.adress);
        return pb;
    }
}


