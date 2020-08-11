package Homework0608;

public class Teacher extends Person {

    private double salary;
    private String degree;
    private String fieldOfTeaching;
    private double yearlyIncome;
    private double annualBonus;

    public Teacher(String firstName, String surname, int age, int salary, String degree, String fieldOfTeaching) {
        super(firstName, surname, age);
        this.salary = salary;
        this.degree = degree;
        this.fieldOfTeaching = fieldOfTeaching;
    }

    public void bonusCalc() {
        this.yearlyIncome = this.salary * 12;
        this.annualBonus = yearlyIncome * 0.1;
    }

    @Override
    public void personIntroduction() {
        super.personIntroduction();
        System.out.println("\nMy degree is " + this.degree + " and I'm teaching " + this.fieldOfTeaching + ". " + "\nI'm earning " + this.salary + " each month, so my yearly income is " + this.yearlyIncome + ". " + "My yearly bonus is " + this.annualBonus);
    }

    @Override
    public void universityGoal() {
        System.out.println("\nI'm going to university to teach");
    }

    @Override
    public void holidayGoal() {
        System.out.println("I'm going to Croatia!");
    }

}
