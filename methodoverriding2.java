import java.util.*;

class User {
    private String name;
    private int age;
    private String place;

    User(String name, int age, String place) {
        this.name = name;
        this.age = age;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPlace() {
        return place;
    }
}

class Consumer extends User {
    private char gender;

    Consumer(String name, int age, String place, char gender) {
        super(name, age, place);
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void display() {
        System.out.println("NAME: " + getName());
        System.out.println("AGE: " + getAge());
        System.out.println("PLACE: " + getPlace());
        System.out.println("GENDER: " + gender);
    }
}

public class methodoverriding2 {
    public static void main(String args[]) {
        Consumer o = new Consumer("SARAVANAN", 19, "theni", 'm');
        o.display();
    }
}
