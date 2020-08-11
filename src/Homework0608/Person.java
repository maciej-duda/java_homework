package Homework0608;

public abstract class Person {
    private String firstName = "Not defined";
    private String surname = "Not defined";
    private int age = 0;

    public abstract void universityGoal();
    public abstract void holidayGoal();


    public Person(String firstName, String surname, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }

    public void personIntroduction() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Hey, I'm " + this.firstName + " " + this.surname + " and I'm " + this.age + " years old!");
    }
}
