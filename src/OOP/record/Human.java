package OOP.record;

import java.util.Objects;

// в этом классе мы используем поля, конструкторы, переопределяем toString, создаем геттеры, hashCode и equals
public class Human {
    private final int birthYear;
    private final String name;
    private final String surname;
    private final String lastname;

    public Human(int birthYear, String name, String surname, String lastname) {
        this.birthYear = birthYear;
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "Human{" +
                "birthYear=" + birthYear +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthYear == human.birthYear && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(lastname, human.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthYear, name, surname, lastname);
    }
}
