package Homework0408;

public class Person {
    public String firstName = "Not defined";
    public String surname = "Not defined";
    public int age = 0;

    public Person() {
    }

    public Person(String name, String surname, int age) {
        this.firstName = name;
        this.surname = surname;
        this.age = age;
    }

    public void personIntroduction() {
        System.out.println("Hey, I'm " + this.firstName + " " + this.surname + " and I'm " + this.age + " years old!");
    }
}
