package Homework0608;

public class Student extends Person {

    private int semester;
    private int year;
    private String studySubject;

    public Student(String firstName, String surname, int studentAge, int semester, int year, String studySubject) {
        super(firstName, surname, studentAge);
        this.semester = semester;
        this.year = year;
        this.studySubject = studySubject;
    }

    @Override
    public void personIntroduction() {
        // Function from person class
        super.personIntroduction();
        System.out.println("I'm studying on " + this.year + " year of " + semester + " semester. " + "My subject is " + studySubject);
    }

    @Override
    public void universityGoal() {
        System.out.println("\nI'm going to university to study");
    }

    @Override
    public void holidayGoal() {
        System.out.println("I'm going to visit my grandpa on holiday");
    }

}
