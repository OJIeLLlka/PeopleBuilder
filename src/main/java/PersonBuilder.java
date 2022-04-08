public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age = 0;
    protected String adress;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAdress(String currentCity) {
        this.adress = currentCity;
        return this;
    }

    public Person build() {
        if (age < 0) {
            throw new IllegalStateException("Такой возраст неуместен.");
        } else if (name == null || surname == null) {
            throw new IllegalStateException("Вы должны ввести имя и фамилию.");
        }
        return new Person(name, surname, age, adress);
    }
}




