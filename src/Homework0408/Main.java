package Homework0408;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------------------");
        Teacher teacher1 = new Teacher("George", "Teacherowsky", 42, 2500, "Dr.", "Web development in Node.js");
        teacher1.bonusCalc();
        teacher1.teacherIntroduction();

        System.out.println("----------------------------------------------------------------------------");

        Student student1 = new Student("Peter", "Studentowsky", 22, 2, 3, "Web development");
        student1.studentIntroduction();
        System.out.println("----------------------------------------------------------------------------");
    }
}
