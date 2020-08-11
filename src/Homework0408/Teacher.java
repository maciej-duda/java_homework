package Homework0408;

public class Teacher extends Person {

    double salary;
    String degree;
    String fieldOfTeaching;
    double yearlyIncome;
    double annualBonus;

    public Teacher(String firstName, String surname, int age, int salary, String degree, String fieldOfTeaching) {
        super(firstName, surname, age);
        this.salary = salary;
        this.degree = degree;
        this.fieldOfTeaching = fieldOfTeaching;
    }

    public void teacherIntroduction() {
        super.personIntroduction();
        System.out.println("My degree is " + this.degree + " and I'm teaching " + this.fieldOfTeaching + ". " + "I'm earning " + this.salary + " each month, so my yearly income is " + this.yearlyIncome + ". " + "My yearly bonus is " + this.annualBonus);
    }

    public void bonusCalc() {
        this.yearlyIncome = this.salary * 12;
        this.annualBonus = yearlyIncome * 0.1;
    }


}
