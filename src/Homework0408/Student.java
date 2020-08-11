package Homework0408;

public class Student extends Person {

    public int semester;
    public int year;
    public String studySubject;

    public Student(String firstName, String surname, int age, int semester, int year, String studySubject) {
        super(firstName, surname, age);
        this.semester = semester;
        this.year = year;
        this.studySubject = studySubject;
    }

    public void studentIntroduction() {
        // Function from person class
        super.personIntroduction();
        System.out.println("I'm studying on " + this.year + " year of " + semester + " semester. " + "My subject is " + studySubject);
    }
}
